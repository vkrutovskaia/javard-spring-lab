package org.shop.profiling;

import static java.util.Objects.nonNull;

import java.lang.management.ManagementFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ProfilingHandlerBeanPostProcessor implements BeanPostProcessor {

  private Map<String, Class> map = new HashMap<>();
  private ProfilerController controller = new ProfilerController();

  public ProfilingHandlerBeanPostProcessor() throws Exception {
    MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
    platformMBeanServer
        .registerMBean(controller, new ObjectName("profiling", "name", "controller"));
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    Class<?> beanClass = bean.getClass();
    if (beanClass.isAnnotationPresent(Profiling.class)) {
      map.put(beanName, beanClass);
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    Class beanClass = map.get(beanName);
    if (nonNull(beanClass)) {
      return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(),
          new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
              if (controller.isEnabled()) {
                System.out.println("Profiling...");
                long before = System.nanoTime();
                Object retVal = method.invoke(bean, args);
                long after = System.nanoTime();
                System.out.println(after - before);
                System.out.println("Done");
                return retVal;
              } else {
                return method.invoke(bean, args);
              }
            }
          });
    }
    return bean;
  }
}

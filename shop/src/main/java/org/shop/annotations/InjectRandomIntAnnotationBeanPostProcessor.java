package org.shop.annotations;

import java.lang.reflect.Field;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

@Component
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {


  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {

    Field[] fields = bean.getClass().getDeclaredFields();

    for (Field field : fields) {
      if (field.isAnnotationPresent(InjectRandomInt.class)) {
        field.setAccessible(true);
        InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
        ReflectionUtils.setField(field, bean,
            getRandomIntInRange(annotation.minValue(), annotation.maxValue()));
      }
    }

    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    return bean;
  }

  private int getRandomIntInRange(int min, int max) {
    return min + (int) (Math.random() * ((max - min) + 1));
  }
}

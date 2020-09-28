package org.shop.config;

import org.shop.data.User;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class PropertyFileApplicationContext extends GenericApplicationContext {

  public PropertyFileApplicationContext(String fileName) {
    PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
    long i = reader.loadBeanDefinitions(fileName);
    System.out.println("Find " + i + "beans");
    refresh();
  }

  public static void main(String[] args) {
    PropertyFileApplicationContext context = new PropertyFileApplicationContext("orderRepository.properties");
    context.getBean(User.class).getId();
  }
}

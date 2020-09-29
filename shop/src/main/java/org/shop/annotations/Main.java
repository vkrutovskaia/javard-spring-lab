package org.shop.annotations;

import org.shop.config.SystemConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SystemConfig.class);
    AnnotationExampleClass annotationExampleClass = context.getBean(AnnotationExampleClass.class);
    System.out.println("Injected random int value is = " + annotationExampleClass.getRandomValue());
  }
}

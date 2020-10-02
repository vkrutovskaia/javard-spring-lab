package org.shop.config;

import java.util.HashMap;
import java.util.Map;
import org.shop.annotations.AnnotationExampleClass;
import org.shop.annotations.InjectRandomIntAnnotationBeanPostProcessor;
import org.shop.common.Sellers;
import org.shop.logging.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

  @Bean
  public Map<Long, String> sellerNames() {
    Map<Long, String> sellerNames = new HashMap<>();
    sellerNames.put(1L, Sellers.AMAZON);
    sellerNames.put(2L, Sellers.SAMSUNG);
    return sellerNames;
  }

  @Bean
  public InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor(){
    return new InjectRandomIntAnnotationBeanPostProcessor();
  }

  @Bean("quoterBean")
  public AnnotationExampleClass quoter(){
    return new AnnotationExampleClass();
  }

  @Bean("logaspect")
  public LoggingAspect loggingAspect(){
    return new LoggingAspect();
  }
}

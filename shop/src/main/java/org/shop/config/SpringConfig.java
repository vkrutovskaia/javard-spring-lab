package org.shop.config;

import org.shop.annotations.InjectRandomIntAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("org.shop")
@Import({RepositoryConfig.class, ServiceConfig.class, DataInitializerConfig.class,
    FactoryConfig.class})
public class SpringConfig {

  @Bean
  public static PropertySourcesPlaceholderConfigurer configurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean
  InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor() {
    return new InjectRandomIntAnnotationBeanPostProcessor();
  }

}

package org.shop.config;

import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryConfig {

  @Bean
  public UserRepositoryFactory userRepositoryFactory() {
    UserRepositoryFactory userRepositoryFactory = new UserRepositoryFactory();
    return userRepositoryFactory;
  }
}

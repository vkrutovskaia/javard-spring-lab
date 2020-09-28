package org.shop.config;

import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.shop.repository.factory")
public class FactoryConfig {

//  @Bean
//  public UserRepositoryFactory userRepositoryFactory() {
//    return new UserRepositoryFactory();
//  }
}

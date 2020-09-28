package org.shop.config;

import org.shop.repository.UserRepository;
import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:orderRepository.properties")
@ComponentScan("org.shop.repository")
public class RepositoryConfig {

  @Bean(name = "userRepository")
  public UserRepository userRepository() {
    return new UserRepositoryFactory().createUserRepository();
  }

}

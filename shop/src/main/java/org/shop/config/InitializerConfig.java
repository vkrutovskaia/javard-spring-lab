package org.shop.config;

import org.shop.DataInitializer;
import org.shop.ProductInitializer;
import org.shop.ProposalInitializer;
import org.shop.SellerInitializer;
import org.shop.UserInitializer;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BeansConfig.class})
public class InitializerConfig {

  @Bean(initMethod = "initData")
  public DataInitializer dataInitializer() {
    return new DataInitializer();
  }

  @Bean
  public ProductInitializer productInitializer(ProductService productService) {
    return new ProductInitializer(productService);
  }

  @Bean
  public ProposalInitializer proposalInitializer() {
    return new ProposalInitializer();
  }

  @Bean
  public SellerInitializer sellerInitializer() {
    return new SellerInitializer();
  }

  @Bean
  public UserInitializer userInitializer(UserService userService) {
    return new UserInitializer(userService);
  }
}

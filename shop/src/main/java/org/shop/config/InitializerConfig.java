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
    DataInitializer dataInitializer = new DataInitializer();
    return dataInitializer;
  }

  @Bean
  public ProductInitializer productInitializer(ProductService productService) {
    ProductInitializer productInitializer = new ProductInitializer(productService);
    return productInitializer;
  }

  @Bean
  public ProposalInitializer proposalInitializer() {
    ProposalInitializer proposalInitializer = new ProposalInitializer();
    return proposalInitializer;
  }

  @Bean
  public SellerInitializer sellerInitializer() {
    SellerInitializer sellerInitializer = new SellerInitializer();
    return sellerInitializer;
  }

  @Bean
  public UserInitializer userInitializer(UserService userService) {
    UserInitializer userInitializer = new UserInitializer(userService);
    return userInitializer;
  }
}

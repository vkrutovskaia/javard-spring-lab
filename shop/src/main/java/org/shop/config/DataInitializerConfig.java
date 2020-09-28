package org.shop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.shop")
public class DataInitializerConfig {

//  @Autowired
//  @Qualifier("productService")
//  ProductService productService;
//  UserService userService;
//
//  @Bean(name = "sellerInitializer")
//  public SellerInitializer sellerInitializer() {
//    Map<Long, String> sellerNames = Collections.emptyMap();
//    return new SellerInitializer(sellerNames);
//  }
//
//  @Autowired
//  @Qualifier("proposalInitializer")
//  public ProposalInitializer proposalInitializer() {
//    return new ProposalInitializer();
//  }
//
//  @Bean(name = "productInitializer")
//  public ProductInitializer productInitializer() {
//    return new ProductInitializer(productService);
//  }
//
//  @Bean
//  public UserInitializer userInitializer(){
//    return new UserInitializer(userService);
//  }
//  @Bean(name = "dataInitializer")
//  public DataInitializer dataInitializer() {
//    return new DataInitializer();
//  }
}

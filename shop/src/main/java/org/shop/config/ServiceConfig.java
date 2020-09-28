package org.shop.config;

import org.shop.api.ItemService;
import org.shop.api.OrderService;
import org.shop.api.ProductService;
import org.shop.api.ProposalService;
import org.shop.api.SellerService;
import org.shop.api.UserService;
import org.shop.api.impl.ItemServiceImpl;
import org.shop.api.impl.OrderServiceImpl;
import org.shop.api.impl.ProductServiceImpl;
import org.shop.api.impl.ProposalServiceImpl;
import org.shop.api.impl.SellerServiceImpl;
import org.shop.api.impl.UserServiceImpl;
import org.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:service.properties")
@ComponentScan("org.shop.service")
public class ServiceConfig {

//  @Autowired
//  @Qualifier("repositoryConfig")
//  RepositoryConfig repositoryConfig;
//
//  @Bean(name = "itemService")
//  public ItemService itemService() {
//    return new ItemServiceImpl(repositoryConfig.itemRepository());
//  }
//
//  @Bean(name = "orderService")
//  public OrderService orderService() {
//    return new OrderServiceImpl();
//  }
//
//  @Bean(name = "productService")
//  public ProductService productService() {
//    return new ProductServiceImpl(repositoryConfig.productRepository());
//  }
//
//  @Bean(name = "proposalService")
//  public ProposalService proposalService() {
//    return new ProposalServiceImpl(repositoryConfig.proposalRepository());
//  }
//
//  @Bean(name = "sellerService")
//  @Autowired
//  public SellerService sellerService() {
//    return new SellerServiceImpl();
//  }
//
//  @Bean(name = "userService")
//  public UserService userService(UserRepository userRepository) {
//    UserServiceImpl userServiceImpl = new UserServiceImpl();
//    userServiceImpl.setRepository(userRepository);
//    return userServiceImpl;
//  }

}

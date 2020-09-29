package org.shop.config;

import org.shop.repository.ItemRepository;
import org.shop.repository.OrderRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.shop.repository.SellerRepository;
import org.shop.repository.UserRepository;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.AbstractMapRepository;
import org.shop.repository.map.ItemMapRepository;
import org.shop.repository.map.OrderMapRepository;
import org.shop.repository.map.ProductMapRepository;
import org.shop.repository.map.ProposalMapRepository;
import org.shop.repository.map.SellerMapRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Repository.properties")
public class RepositoryConfig {

  @Bean
  public AbstractMapRepository abstractMapRepository() {
    return new AbstractMapRepository();
  }

  @Bean
  public ItemRepository itemMapRepository() {
    return new ItemMapRepository();
  }

  @Bean
  public OrderRepository orderMapRepository(
      @Value(value = "${initialSequence}") long sequence) {
    OrderMapRepository orderMapRepository = new OrderMapRepository(sequence);
    orderMapRepository.setSequence(sequence);
    return orderMapRepository;
  }

  @Bean
  public ProductRepository productMapRepository() {
    return new ProductMapRepository();
  }

  @Bean
  public ProposalRepository proposalMapRepository() {
    return new ProposalMapRepository();
  }

  @Bean
  public SellerRepository sellerMapRepository() {
    return new SellerMapRepository();
  }

  @Bean
  public UserRepository userRepository() {
    return new UserRepositoryFactory().createUserRepository();
  }

}

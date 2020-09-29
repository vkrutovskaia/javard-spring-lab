package org.shop;


import java.util.List;
import org.shop.config.SystemConfig;
import org.shop.data.Item;
import org.shop.data.Order;
import org.shop.data.Product;
import org.shop.data.Proposal;
import org.shop.data.Seller;
import org.shop.data.User;
import org.shop.repository.ItemRepository;
import org.shop.repository.OrderRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.shop.repository.SellerRepository;
import org.shop.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SystemConfig.class);

    System.out.println("\n" + "=========Initializers work checking=========" + "\n");

    System.out.println("*[UserRepository]*");
    UserRepository userRepository = context.getBean(UserRepository.class);
    List<User> users = userRepository.getUsers();
    System.out.println("Contains: " + users + "\n");

    System.out.println("*[SellerRepository]*");
    SellerRepository sellerRepository = context.getBean(SellerRepository.class);
    List<Seller> sellers = sellerRepository.getSellers();
    System.out.println("Contains: " + sellers + "\n");

    System.out.println("*[ProductRepository]*");
    ProductRepository productRepository = context.getBean(ProductRepository.class);
    List<Product> products = productRepository.getProducts();
    System.out.println("Contains: " + products + "\n");

    System.out.println("*[ProposalRepository]*");
    ProposalRepository proposalRepository = context.getBean(ProposalRepository.class);
    List<Proposal> proposalSellers = proposalRepository.getProposalsBySellerId(1L);
    List<Proposal> proposalProducts = proposalRepository.getProposalsByProductId(3L);

    System.out.println("Contains: " + proposalSellers);
    System.out.println("Contains: " + proposalProducts + "\n");

    System.out.println("*[OrderRepository]*");
    OrderRepository orderRepository = context.getBean(OrderRepository.class);
    List<Order> orders1 = orderRepository.getOrdersByUserId(1L);
    List<Order> orders2 = orderRepository.getOrdersByUserId(2L);

    System.out.println("Contains: " + orders1);
    System.out.println("Contains: " + orders2 + "\n");

    System.out.println("*[ItemRepository]*");
    ItemRepository itemRepository = context.getBean(ItemRepository.class);
    List<Item> items= itemRepository.getItemsByOrderId(1L);
    System.out.println("Contains: " + items);
  }
}

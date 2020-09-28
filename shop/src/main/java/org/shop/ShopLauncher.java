package org.shop;


import org.shop.config.SpringConfig;
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
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        SpringConfig.class);

    ProductInitializer productInitializer = context.getBean(ProductInitializer.class);
    ProposalInitializer proposalInitializer = context.getBean(ProposalInitializer.class);
    SellerInitializer sellerInitializer = context.getBean(SellerInitializer.class);
    UserInitializer userInitializer = context.getBean(UserInitializer.class);
    DataInitializer dataInitializer = context.getBean(DataInitializer.class);

    productInitializer.initProducts();
    proposalInitializer.initProposals();
    sellerInitializer.initSellers();
    userInitializer.initUsers();
    dataInitializer.initData();


  }

}

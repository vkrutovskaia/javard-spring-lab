
package org.shop;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * The main Data Initializer util class.
 */
public class DataInitializer {

  /**
   * The seller initializer.
   */
  @Autowired
  private SellerInitializer sellerInitializer;

  /**
   * The product initializer.
   */
  @Autowired
  private ProductInitializer productInitializer;

  /**
   * The proposal initializer.
   */
  @Autowired
  private ProposalInitializer proposalInitializer;

  /**
   * The user initializer.
   */
  @Autowired
  private UserInitializer userInitializer;

  /**
   * Inits the data.
   */

  public void initData() {
    sellerInitializer.initSellers();
    userInitializer.initUsers();
    productInitializer.initProducts();
    proposalInitializer.initProposals();
  }
}
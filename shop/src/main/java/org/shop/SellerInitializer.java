package org.shop;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.shop.api.SellerService;
import org.shop.data.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The Seller Initializer util class.
 */
@Component(value = "sellerInitializer")
public class SellerInitializer {

  /**
   * The seller service.
   */
  @Autowired
  private SellerService sellerService;
  /**
   * The seller names.
   */
  private Map<Long, String> sellerNames;

  public SellerInitializer(Map<Long, String> sellerNames) {
    this.sellerNames = sellerNames;
  }

  /**
   * Inits the sellers.
   */
  public void initSellers() {
    List<Seller> sellers = new LinkedList<>();

    for (Map.Entry<Long, String> entry : sellerNames.entrySet()) {
      Seller seller = new Seller();
      seller.setId(entry.getKey());
      seller.setName(entry.getValue());

      sellers.add(seller);
    }

    sellerService.importSellers(sellers);
  }
}

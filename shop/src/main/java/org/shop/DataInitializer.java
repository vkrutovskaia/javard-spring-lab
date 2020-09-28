package org.shop;

import javax.annotation.PostConstruct;
import org.shop.annotations.InjectRandomInt;
import org.springframework.stereotype.Component;

/**
 * The main Data Initializer util class.
 */
@Component(value = "dataInitializer")
public class DataInitializer {

    /** The seller initializer. */

    private SellerInitializer sellerInitializer;
    
    /** The product initializer. */

    private ProductInitializer productInitializer;
    
    /** The proposal initializer. */

    private ProposalInitializer proposalInitializer;
    
    /** The user initializer. */

    private UserInitializer userInitializer;

    /**Custom annotation from 8th homework task*/
    @InjectRandomInt(minValue = 1, maxValue = 10)
    private int randomValue;

    public DataInitializer(SellerInitializer sellerInitializer,
        ProductInitializer productInitializer, ProposalInitializer proposalInitializer,
        UserInitializer userInitializer) {
        this.sellerInitializer = sellerInitializer;
        this.productInitializer = productInitializer;
        this.proposalInitializer = proposalInitializer;
        this.userInitializer = userInitializer;
    }

    /**
     * Inits the data.
     */
    @PostConstruct
    public void initData() {
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
        System.out.println("Testing custom annotation: " + randomValue);
    }
}

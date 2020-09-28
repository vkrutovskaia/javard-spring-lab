package org.shop.common;

import org.springframework.stereotype.Component;

@Component(value = "sellers")
public final class Sellers {

    public static final String AMAZON = "Amazon";
    
    public static final String SAMSUNG = "Samsung";

    private Sellers() {
        super();
    }

}

package org.shop.data;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * The Base Entity.
 * 
 * @author Dzmitry_Naskou
 */
public interface Entity extends Serializable {
    
    /**
     * Gets the entity id.
     *
     * @return the id
     */
    Long getId();

    /**
     * Sets the entity id.
     *
     * @param id the new id
     */
    void setId(Long id);
}

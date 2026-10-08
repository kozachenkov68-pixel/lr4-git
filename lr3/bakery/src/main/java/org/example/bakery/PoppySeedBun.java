package org.example.bakery;

import java.time.LocalDateTime;

/**
 * Булка с маком.
 */
public class PoppySeedBun extends Bun {

    public PoppySeedBun(double price, LocalDateTime createdAt) {
        super(price, createdAt);
    }

    @Override
    public String getType() {
        return "Булка с маком";
    }
}
package org.example.bakery;

import java.time.LocalDateTime;

/**
 * Булка с перцем.
 */
public class PepperBun extends Bun {

    public PepperBun(double price, LocalDateTime createdAt) {
        super(price, createdAt);
    }

    @Override
    public String getType() {
        return "Булка с перцем";
    }
}
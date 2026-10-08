package org.example.bakery;

import java.time.LocalDateTime;

/**
 * Сладкая булка.
 */
public class SweetBun extends Bun {

    public SweetBun(double price, LocalDateTime createdAt) {
        super(price, createdAt);
    }

    @Override
    public String getType() {
        return "Сладкая булка";
    }
}
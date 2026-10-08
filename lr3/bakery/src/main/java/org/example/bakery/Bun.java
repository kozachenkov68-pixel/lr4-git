package org.example.bakery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс "Булка".
 */
public abstract class Bun {

    private final double price;
    private final List<String> ingredients;
    private final LocalDateTime createdAt;

    /**
     * Конструктор булки.
     *
     * @param price     цена
     * @param createdAt дата и время создания
     */
    public Bun(double price, LocalDateTime createdAt) {
        this.price = price;
        this.createdAt = createdAt;
        this.ingredients = new ArrayList<>();
    }

    /**
     * Добавить ингредиент отдельно.
     *
     * @param ingredient название ингредиента
     */
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    /**
     * Проверить наличие ингредиента.
     *
     * @param ingredient название ингредиента
     * @return true, если ингредиент есть
     */
    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Возвращает вид булки.
     *
     * @return название вида
     */
    public abstract String getType();

    @Override
    public String toString() {
        return getType() + "{" +
                "price=" + price +
                ", ingredients=" + ingredients +
                ", createdAt=" + createdAt +
                '}';
    }
}
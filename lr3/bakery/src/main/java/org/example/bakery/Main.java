package org.example.bakery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Консольное приложение для демонстрации.
 */
public class Main {

    public static void main(String[] args) {
        List<Bun> buns = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();

        // 10 объектов с разным промежутком выпечки
        buns.add(new SweetBun(50.0, now.minusMinutes(1)));
        buns.add(new PoppySeedBun(60.0, now.minusMinutes(2)));
        buns.add(new PepperBun(70.0, now.minusMinutes(3)));
        buns.add(new SweetBun(55.0, now.minusMinutes(4)));
        buns.add(new PoppySeedBun(65.0, now.minusMinutes(5)));
        buns.add(new PepperBun(75.0, now.minusMinutes(6)));
        buns.add(new SweetBun(52.0, now.minusMinutes(7)));
        buns.add(new PoppySeedBun(62.0, now.minusMinutes(8)));
        buns.add(new PepperBun(72.0, now.minusMinutes(9)));
        buns.add(new SweetBun(58.0, now.minusMinutes(10)));

        // ингредиенты добавляются отдельно
        buns.get(0).addIngredient("сахар");
        buns.get(1).addIngredient("мак");
        buns.get(2).addIngredient("перец");
        buns.get(3).addIngredient("корица");
        buns.get(4).addIngredient("мак");
        buns.get(5).addIngredient("перец");
        buns.get(6).addIngredient("сахар");
        buns.get(7).addIngredient("мак");
        buns.get(8).addIngredient("перец");
        buns.get(9).addIngredient("сахар");

        System.out.println("Все булки:");
        for (Bun bun : buns) {
            System.out.println(bun);
        }

        System.out.println("\nБулки, созданные ровно 5 минут назад:");
        LocalDateTime fiveMinutesAgo = now.minusMinutes(5);
        for (Bun bun : buns) {
            if (bun.getCreatedAt().equals(fiveMinutesAgo)) {
                System.out.println(bun);
            }
        }

        System.out.println("\nБулки, в которых есть перец:");
        for (Bun bun : buns) {
            if (bun.hasIngredient("перец")) {
                System.out.println(bun);
            }
        }
    }
}
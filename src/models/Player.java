package models;

import java.util.ArrayList;

public class Player {
    private static int coins = 0;
    private static int animal_coins = 0;
    private ArrayList<Item> bag;

    public Player () {

    }

    public void addCoins() {
        coins += 100;
    }
    public void addAnimalCoins() {
        animal_coins += 5;
    }

    public void addItem(Item item) {
        bag.add(item);
    }
}

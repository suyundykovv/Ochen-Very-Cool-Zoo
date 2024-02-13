package models;

import java.util.ArrayList;

public class Player {
    private int coins = 0;
    private int animal_coins = 0;
    private ArrayList<Item> bag;

    public Player () {

    }

    public int getCoins() {
        return coins;
    }

    public int getAnimal_coins() {
        return animal_coins;
    }

    public void addCoins() {
        coins += 100;
    }
    public void removeCoins(int c) {
        coins -= c;
    }

    public void addAnimalCoins() {
        animal_coins += 5;
    }
    public void removeAnimalCoins() {
        animal_coins -= 50;
    }

    public void addItem(Item item) {
        bag.add(item);
        coins -= item.getPrice();
    }
}

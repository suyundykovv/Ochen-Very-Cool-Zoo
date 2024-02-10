package models;

public class Item {
    private static int id = 0;
    private String name;

    public Item(String name) {
        id++;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

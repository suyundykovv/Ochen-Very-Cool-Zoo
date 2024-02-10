package models;

import java.util.ArrayList;

public class Animal {
    private static int id;
    private String name;
    private int age;
    private String type;
    private String location;
    private ArrayList actions;

    public Animal() {

    }
    public Animal (int id, String name, int age, String type, String location, ArrayList actions) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.location = location;
        this.actions = actions;
    }
    public Animal (String name, int age, String type, String location, ArrayList actions) {
        id++;
        this.name = name;
        this.age = age;
        this.type = type;
        this.location = location;
        this.actions = actions;
    }

    public static void setId(int id) {
        Animal.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setActions(ArrayList actions) {
        this.actions = actions;
    }


    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList getActions() {
        return actions;
    }
}

package org.example.thuchanh2;

public class Animal {
private int weight;
private int height;


    public Animal(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void eat() {
        System.out.println("eat thóc");
    }
    public void sleep() {
        System.out.println("khò khò");
    }
}

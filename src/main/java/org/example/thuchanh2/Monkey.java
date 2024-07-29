package org.example.thuchanh2;

public class Monkey  extends  Animal {
    public Monkey(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void eat() {
        System.out.println("Monkey eat banana");
    }
    public void sleep(){
        System.out.println("Monkey sleep");
    }




}

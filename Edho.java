package org.example;

import java.beans.ConstructorProperties;

public class Edho {

    private int x;
    private Avtundhi avi;
    private Bottle b;
    public Edho(){
        System.out.println("Edho Constructor");
    }

    public Bottle getB() {
        return b;
    }

    public void setB(Bottle b) {
        this.b = b;
    }

    @ConstructorProperties({"x","b"})
    public Edho(int x ,Bottle b){
        this.x = x;
        this.b = b;
        System.out.println("Called param constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("setter injection using variable");
        this.x = x;
    }

    public Avtundhi getAvi() {
        return avi;
    }

    public void setAvi(Avtundhi avi) {
        System.out.println("object setter injection ");
        this.avi = avi;
    }

    void run(){
        System.out.println("running Used Object is");
        b.type();
    }
}

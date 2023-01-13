package ua.lviv.lgs3;

public class Main {
    public static void main(String[] args) {

        Frog f = new Frog();

        ((Amphibian) f).eat();
        ((Amphibian) f).sleep();
        ((Amphibian) f).swim();
        ((Amphibian) f).walk();


    }
}

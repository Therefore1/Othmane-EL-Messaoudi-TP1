package main.src.tp1.EX3;

// Main.java
public class Main {
    public static void main(String[] args) {
        Point origine = new Point("Origine", 0.0);

        System.out.println("Position initiale :");
        origine.affiche();

        origine.translate(-4.5);

        System.out.println("Après translation de -4.5 :");
        origine.affiche();
    }
}
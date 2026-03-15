package main.src.tp1.EX2;

// Main.java
public class Main {
    public static void main(String[] args) {
        Point pointA = new Point();
        pointA.initialiser('A', 3.5);

        System.out.println("Avant translation :");
        pointA.affiche();

        pointA.translate(7.0);

        System.out.println("Après translation de +7.0 :");
        pointA.affiche();

        // Copie du point
        Point pointB = new Point();
        pointB.initialiser(pointA);
        System.out.println("Copie (Point B) :");
        pointB.affiche();
    }
}
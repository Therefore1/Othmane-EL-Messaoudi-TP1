package main.src.tp1.EX3;

// Point.java
public class Point {
    private String nom;
    private double abscisse;

    // Constructeur (remplace initialiser)
    public Point(String nom, double abscisse) {
        this.nom      = nom;
        this.abscisse = abscisse;
    }

    public void affiche() {
        System.out.println("Point \"" + nom + "\" -> abscisse = " + abscisse);
    }

    public void translate(double valeur) {
        this.abscisse += valeur;
    }
}
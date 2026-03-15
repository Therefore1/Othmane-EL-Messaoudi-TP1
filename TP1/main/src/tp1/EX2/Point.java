package main.src.tp1.EX2;

// Point.java
public class Point {
    private char nom;
    private double abscisse;

    // Initialisation par valeurs
    public void initialiser(char nom, double abscisse) {
        this.nom      = nom;
        this.abscisse = abscisse;
    }

    // Initialisation par copie d'un autre Point
    public void initialiser(Point source) {
        this.nom      = source.nom;
        this.abscisse = source.abscisse;
    }

    public void affiche() {
        System.out.println("Point " + nom + " -> abscisse = " + abscisse);
    }

    public void translate(double valeur) {
        this.abscisse += valeur;
    }
}
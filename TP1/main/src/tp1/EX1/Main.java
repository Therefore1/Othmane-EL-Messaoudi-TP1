package main.src.tp1.EX1;

// Main.java
public class Main {
    public static void main(String[] args) {
        Personne etudiant1 = new Personne();
        etudiant1.initialiser("AB123456", "El Amrani", "Youssef",
                "youssef.elamrani@uca.ma", 21);
        etudiant1.afficherPersonne();

        Personne etudiant2 = new Personne();
        etudiant2.initialiser("CD789012", "Benali", "Sara",
                "sara.benali@uca.ma", 22);
        etudiant2.afficherPersonne();
    }
}
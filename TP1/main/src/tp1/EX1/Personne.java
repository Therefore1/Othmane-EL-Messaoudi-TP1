package main.src.tp1.EX1;

// Personne.java
public class Personne {
    String cin;
    String nom;
    String prenom;
    String email;
    int age;

    public void initialiser(String cin, String nom, String prenom, String email, int age) {
        this.cin   = cin;
        this.nom   = nom;
        this.prenom = prenom;
        this.email  = email;
        this.age    = age;
    }

    public void afficherPersonne() {
        System.out.println("=============================");
        System.out.println("CIN     : " + cin);
        System.out.println("Nom     : " + nom);
        System.out.println("Prénom  : " + prenom);
        System.out.println("Email   : " + email);
        System.out.println("Âge     : " + age + " ans");
        System.out.println("=============================");
    }
}
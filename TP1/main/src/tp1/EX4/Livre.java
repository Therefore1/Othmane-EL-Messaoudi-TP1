package main.src.tp1.EX4;

// Livre.java
public class Livre {
    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    public Livre(String titre, String auteur, int nbPages) {
        this.titre   = titre;
        this.auteur  = auteur;
        this.nbPages = nbPages;
        this.prix    = -1;
        this.prixFixe = false;
    }

    public Livre(String titre, String auteur, int nbPages, double prix) {
        this(titre, auteur, nbPages);   // appel du 1er constructeur
        this.prix    = prix;
        this.prixFixe = true;
    }

    // ---- Getters ----
    public String getTitre()  { return titre; }
    public String getAuteur() { return auteur; }
    public int    getNbPages(){ return nbPages; }
    public double getPrix()   { return prix; }

    // ---- Setters ----
    public void setTitre(String titre)   { this.titre  = titre; }
    public void setAuteur(String auteur) { this.auteur = auteur; }
    public void setNbPages(int nbPages)  { this.nbPages = nbPages; }

    public void setPrix(double prix) {
        if (prixFixe) {
            System.out.println("[ERREUR] Le prix de \"" + titre + "\" est déjà fixé.");
        } else {
            this.prix    = prix;
            this.prixFixe = true;
        }
    }

    // ---- Méthodes métier ----
    public boolean prixEstFixe() {
        return prixFixe;
    }

    public int compare(Livre autre) {
        if (this.nbPages == autre.nbPages) return  0;
        if (this.nbPages >  autre.nbPages) return  1;
        return -1;
    }

    @Override
    public String toString() {
        String infoPrix = prixFixe ? prix + " MAD" : "Prix pas encore donné";
        return "[" + titre + "] par " + auteur +
                " | " + nbPages + " pages | Prix : " + infoPrix;
    }
}
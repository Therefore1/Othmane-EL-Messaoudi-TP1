package main.src.tp1.EX4;

// Main.java
public class Main {
    public static void main(String[] args) {

        // --- Création des livres ---
        Livre l1 = new Livre("L'Alchimiste", "Paulo Coelho", 208);
        Livre l2 = new Livre("Sapiens", "Yuval Noah Harari", 512, 95.0);
        Livre l3 = new Livre("Clean Code", "Robert C. Martin", 431);

        // Fixer le prix de l1
        l1.setPrix(75.0);
        l1.setPrix(80.0);   // doit afficher une erreur

        // Afficher les livres
        System.out.println("=== Livres ===");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        // Comparaison
        System.out.println("\n=== Comparaison ===");
        int res = l2.compare(l3);
        String msg = res == 0 ? "même nombre de pages"
                : res == 1 ? "Sapiens a plus de pages"
                :            "Sapiens a moins de pages";
        System.out.println(msg);

        // Étagère
        Etagere etagere = new Etagere(3);
        etagere.ajouter(l1);
        etagere.ajouter(l2);
        etagere.ajouter(l3);

        System.out.println("\n=== Contenu de l'étagère ===");
        for (int i = 1; i <= etagere.getNbLivres(); i++) {
            System.out.println(i + ". " + etagere.getLivre(i));
        }

        // Recherche
        int pos = etagere.chercher("Sapiens", "Yuval Noah Harari");
        System.out.println("\n\"Sapiens\" trouvé à la position : " + pos);

        // Suppression
        etagere.supprimer(1);
        System.out.println("\n=== Après suppression du livre en position 1 ===");
        for (int i = 1; i <= etagere.getNbLivres(); i++) {
            System.out.println(i + ". " + etagere.getLivre(i));
        }

        // Test étagère pleine
        Livre l4 = new Livre("Le Seigneur des Anneaux", "Tolkien", 1200);
        etagere.ajouter(l4);
        etagere.ajouter(l4); // doit afficher erreur étagère pleine
    }
}
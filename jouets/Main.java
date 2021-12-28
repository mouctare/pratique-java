package jouets;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // créer une liste qui va stocker le nom de plusieurs jouets
        List<Jouet> jouets = new ArrayList<>();
        jouets.add(new Jouet("Scrab Delux", 20, "Petit jouet de socié", 5));
        jouets.add(new Jouet("Lu Gary", 15, "Jeu avec plein de roles", 10));
        jouets.add(new Jouet("Zebre Figurine", 6 ,"Super figurine", 5));
        jouets.add(new Jouet("Osobot Evo", 70 ,"robo pour apprendre à dev", 15));
        jouets.add(new Jouet("Araignée peluche", 30, "peluche toute douce", 5));
        jouets.add(new Jouet("Ligo Start wars", 120, "super ligo box de start wars", 20));
        jouets.add(new Jouet("Battle", 20, "jeu de battaille", 40));


      Collections.sort(jouets, new PrixComparator());
      // Affichage de la liste
        // Pour chaque valeur dans une liste de composant
        for(Jouet jouet : jouets){
            System.out.println("Jouet" + jouet.getName() + "("+ jouet.getPrice() + "€) " +
                    jouet.getDescrption() + "(promo: " + jouet.getPromo() + "% de réduction)");
        }


    }
}


package banques;

import java.util.Scanner;

public class Main {
public  static void main(String[] args) {
    // Afficher un message de bien venue
    System.out.println("Bienvenue à la GBA, que souhaitez-vous faire ?");
    
    // créer une variable qui va stocker le compte courant
    
    int compteCourant = 9600;

    System.out.println("Vous avez actuellement " + compteCourant + " euro " + " " + "dans votre compte courant");

    // Proposer à l'utilisateur plusieurs choix
    System.out.println("Ecrire 1 : Voire le solde\nEcrire 2 : Deposer de l'argent\nEcrire 3: Retirer de l'argent");

    // recolter ce que la personne va ecrire
    Scanner scanner = new Scanner(System.in);
    int choix = scanner.nextInt();

}
    
}

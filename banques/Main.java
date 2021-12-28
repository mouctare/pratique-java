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

    // verification
    if(choix == 1){
        System.out.println("Votre solde est de: " + compteCourant);
    }

   else  if(choix == 2){
        System.out.println("Combien souhaitez vous déposer sur votre compe ? ");

        // recuperer le montant 

        int montant = scanner.nextInt();

        // ajouter au solde/compte courant
         compteCourant += montant;

         // un messange qui confirme que le depot s'est bien fait

         System.out.println("Vous avez déposez  " + montant + " euro ");

    }  
    else if(choix == 3){
        System.out.println("Combien souhaitez vous retirez d'argent  sur votre compte ?");

        int montant = scanner.nextInt();

         // vérifier si elle a assez d'argent

         if(compteCourant - montant >= 0){

            compteCourant -= montant;

            System.out.println("Vous avez récuperer  " + montant + " euro ");
            System.out.println("Votre solde est de  " + compteCourant + " euro ");

         } else{
            System.out.println("Vous n'avez pas les fonds nécessaires");
 
         }
    }

}
    
}

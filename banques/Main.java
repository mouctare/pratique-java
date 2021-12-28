package banques;

import java.util.Scanner;

public class Main {
    private  static  Scanner scanner = new Scanner(System.in);
    private  static int compteCourant;
    

public static void afficherSolde(){
    System.out.println("Votre solde est de: " + compteCourant);
}

public static void deposerArgent(){
    System.out.println("Combien souhaitez vous déposer sur votre compe ? ");
    
    int montant = scanner.nextInt();

     compteCourant += montant;

    System.out.println("Vous avez déposez  " + montant + " euro ");

}

public static void retirerArgenty(){
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
    public  static void main(String[] args) {
    
    System.out.println("Bienvenue à la GBA, que souhaitez-vous faire ?");
    
    
    compteCourant = 9600;

   
    System.out.println("Vous avez actuellement " + compteCourant + " euro " + " " + "dans votre compte courant");

    // Proposer à l'utilisateur plusieurs choix
    System.out.println("Ecrire 1 : Voire le solde\nEcrire 2 : Deposer de l'argent\nEcrire 3: Retirer de l'argent");

      
    int choix = scanner.nextInt();

    // verification
    if(choix == 1){
        afficherSolde();
    }

   else  if(choix == 2){
       deposerArgent();
       
    }  
    else if(choix == 3){
       retirerArgenty();
    }

}
    
}

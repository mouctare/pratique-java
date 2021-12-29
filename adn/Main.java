package adn;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Bonjour Quel est votre prenom");

          String prenom = scanner.nextLine();

          System.out.println("Quel est votre age");

          int age = scanner.nextInt();

          System.out.println("Quel est votre genre/sexe");

          String sexe = scanner.next();

          System.out.println("Bonjour, " + prenom + ", vous avez " + age + " ans" + " vous etes du genre "  + sexe);
    
         
          String adn = "77x7xx7";

          long compteurTaille = adn.chars().filter(c -> c == 'x').count();
          System.out.println("nombre de x : " + compteurTaille);

        switch(Math.toIntExact(compteurTaille)){
            case 1:
            System.out.println("0.5m-1m50");
              break;
            case 2:
            System.out.println("1m51-1m70");
             break;
            
            case 3:
            System.out.println("1m71-1m80");
             break;
            case 4:
            System.out.println("1m81-1m90");
             break;

            case 5:
            System.out.println("+ 1m90");
             break;
            default:
              System.out.println("Taille non trouvé !");
              break;
        }

    }
}

}



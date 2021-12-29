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
    
         
          String adn = "77777x7777x777x77x77xxxx";

          long compteurTaille = adn.chars().filter(c -> c == 'x').count();
          System.out.println("nombre de x : " + compteurTaille);
      

        if(compteurTaille < 18 && age < 21){

        System.out.println(" vous avez moins  de 21 ans");
     }
       else if(compteurTaille > 6 && age > 21){
        System.out.println(" vrai");

     }
       else if(compteurTaille <= 6 && age >= 65){
        System.out.println(" vrai");

     }else{
        System.out.println("faux, vous mentez");  
     }
         
    } 
    
}
}


package adn;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

     System.out.println("Bonjour Quel est votre prenom");

      String prenom = scanner.nextLine();

      System.out.println("Quel est votre age");

      int age = scanner.nextInt();

      System.out.println("Quel est votre genre/sexe");

      String sexe = scanner.next();

      System.out.println("Bonjour, " + prenom + ", vous avez " + age + " ans" + " vous etes du genre "  + sexe);
         
         
    } 
    
  }


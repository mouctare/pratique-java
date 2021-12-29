package adn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {

public static void main(String[] args) {

    int compteur = 0;

    // parcourir le fichier et lire chaque sequence d'ADN
   File monfier = new File("nav.txt");

   // verifier que le ficier existe
   if(monfier.exists()) {
       System.out.println("Fier existant");

       // on essaie de Lire Le fichier

    try{
       
        BufferedReader lecture = new BufferedReader(new FileReader(monfier));
        String ligne = lecture.readLine();

        // boucler sur chaque ligne tant qu'il y'a en a encore
        while(ligne != null){
            int nombreCaractere = ligne.length();
            if(nombreCaractere < 6){
               compteur +=1;
            }
            System.out.println(ligne);
            ligne = lecture.readLine();
        }


       }catch(IOException e){
         e.printStackTrace();
       }
     
      
   }else{
    System.out.println("Fier existant not found");  
   }

   System.out.println("Le nombre de personne de plus de 65 ans est de : " + compteur);  
}

}



package adn;

public class Main {

public static void main(String[] args) {

    String adn = "7777x777777x777777";
  

    // analyser si c'est de 7 ou des 9

    char[] tableau = adn.toCharArray();
    String sexe = "femme";

    if(adn.contains("7")){
        sexe = "homme";
       }

    System.out.println("Le sexe de la personne est: " + sexe);


  /*   for(char caractere : tableau){
        System.out.println(caractere);

        if(caractere == '7'){
            sexe = "homme";
        }

        System.out.println("Le sexe de la personne est: " + sexe);
    }

     }
      */
    }

}
package adn;

public class Main {

public static void main(String[] args) {

    String adn = "999";
     
    //Vérifier qu'un caractère est présent dans variable tableau ou une chaine
    long count = adn.chars().filter(c -> c == '7').count();
        String phrase = count == 0 ? "La personne est un homme" : "La personne set une femme";
  
     System.out.println(phrase);
    } 
    
  }


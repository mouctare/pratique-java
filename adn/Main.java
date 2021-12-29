package adn;

public class Main {

public static void main(String[] args) {

    String adn = "999";
     
    //Vérifier qu'un caractère est présent dans variable tableau ou une chaine
    long count = adn.chars().filter(c -> c == '7').count();
    int nombreCaracteres = adn.length();
    

    if(nombreCaracteres <= 18){
        System.out.println("Vous avez moins de 21 ans");
    } else if(nombreCaracteres == 21 && nombreCaracteres > 65){
        System.out.println("Vous avez  21 ans");
    }else{
        System.out.println("Vous avez plus de 65 ans");
    }

     if(count == 0){
        System.out.println("Le sexe de la personne est une femme");
    }else{
     System.out.println("Le sexe de la personne est un homme ");
    } 
    
  }

}
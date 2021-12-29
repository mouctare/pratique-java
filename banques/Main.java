package banques;
import banqueInPoo.CompteCourant;

public class Main {
   
    public  static void main(String[] args) {
    
    System.out.println("Bienvenue à la GBA, que souhaitez vous faire ?");

    CompteCourant compte = new CompteCourant("Mouctar", 12000);
    compte.displayBalance();
    compte.depositMoney(300);
    compte.displayBalance();
    compte.withdrawWoney(130);
    compte.displayBalance();
    

}
    
}

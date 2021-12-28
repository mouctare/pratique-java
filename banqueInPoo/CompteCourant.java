package banqueInPoo;

public class CompteCourant {
   private String ownerName;
   private int amount;
   private int authorizedOverdraft;

   public CompteCourant(String ownerName, int amount){
       this.ownerName = ownerName;
       this.amount = amount;
       this.authorizedOverdraft = 0;
   }
    
   public void  displayBalance(){
      System.out.println("Le solde de votre compte est de " + this.amount + " euro ");
   }

   public void  depositMoney(int amount){
      this.amount += amount;
   }
   
   // retirer argent
   public void  withdrawWoney(int amount){
       // Vérification découvert autorisé
       int amountAfterCalculation = this.amount - amount;

      if(amountAfterCalculation > this.authorizedOverdraft){
         this.amount -= amount;

       } else{
        System.out.println("Vous n'avez pas les fonds nécessaires ");
       }
    
   }
   
  

}

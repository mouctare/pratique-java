package jouets;

public class Jouet implements Comparable<Jouet> {
    private String name;
    private int price;
    private String descrption;
    private int promo;

   public Jouet(String name, int price, String descrption, int promo){
       this.name = name;
       this.price = price;
       this.descrption = descrption;
       this.promo = promo;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    @Override
    public int compareTo(Jouet jouet2) {
       // Il permet de comparer l'objet dans lequel je me trouve et un autre objet
        return this.getName().compareTo(jouet2.getName());
    }
    
}

package  jouets;
import java.util.Comparator;

public class PrixComparator implements Comparator<Jouet> {

        @Override
        public int compare(Jouet joueto1, Jouet joueto2) {
            // je compare le prix c'est à dire s'il ya des produit qui ont le meme prix on les met par ordre alphabétique
            if(joueto1.getPrice() == joueto2.getPrice())
            {
                return joueto1.compareTo(joueto2); // comparaison du nom
            }
            return joueto1.getPrice() - joueto2.getPrice();
        }

// Tri
//   Collections.sort(jouets, new Comparator<Jouet>() {

//   @Override
//   public int compare(Jouet jouet1, Jouet jouet2) {
//     if(jouet1.getPrice() > jouet2.getPrice()){
//       return 1;
//  }else {
//    return 0;
// }
// }
//   });
}

import java.util.List;

public class Panier extends Boutique{
    public int prixTotalPanier() {
        int total = 0;
        for (Produit produit : getProduitsenvente()) {
            total = total + produit.getPrix();
        }
        return total;
    }
}

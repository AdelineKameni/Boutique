import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Boutique {
 private List<Produit> produitsenvente= new ArrayList<>();


    int idProduit= 0;
    public void addProduit(Produit produit){
        idProduit++;
        produit.setId(idProduit);
        produitsenvente.add(produit);
    }

    public List<Produit> getProduitsenvente() {
        return produitsenvente;
    }
    ArrayList<Produit> listProduits = new ArrayList<>();


public void afficherstock(){
    System.out.println("Le stock de la boutique est :");
     for ( Produit produit : produitsenvente){
         produit.afficher();
     }
}

}

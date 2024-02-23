import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boutique boutique =new Boutique();
        Produit television;
        television = new ProduitsElectronique("Télévision", "Écran HD, Smart TV", 500,5);

       Produit chocolat;
        chocolat = new  ProduitsAlimentaire("Chocolat", "Chocolat noir",20, LocalDate.of(2024, 12, 31));

        Produit eauMinerale;
        eauMinerale = new ProduitBoisson("Eau minérale", "Eau de source",2, 500);
        boutique.addProduit(television);
        boutique.addProduit( chocolat);
        boutique.addProduit(eauMinerale);

        Panier panier1;
        panier1 = new Panier();
        panier1.addProduit(chocolat);
        panier1.addProduit(eauMinerale);


        boutique.afficherstock();
        System.out.println(boutique.getProduitsenvente());

        panier1.afficherstock();
        System.out.println(panier1.getProduitsenvente());

        System.out.println("Le prix total du panier est :" + panier1.prixTotalPanier());


    }
}

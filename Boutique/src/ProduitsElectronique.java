public class ProduitsElectronique extends Produit{
    private int garantie;

    public ProduitsElectronique(String nom, String description, int prix, int garantie) {
        super(nom, description, prix);
        this.garantie = garantie;
    }

    public void afficher(){
        super.afficher();
        System.out.println("Garantie "+ garantie + "ans");
    }
    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }
}

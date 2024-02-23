public abstract class Produit {
    private String nom;
    private String description ;
    private int id;
    private int prix;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription(String description) {
        return description;
    }


    public Produit(String nom, String description,int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }
    public void afficher(){
        System.out.println("Nom:" +nom);
        System.out.println("Description:" +description);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}

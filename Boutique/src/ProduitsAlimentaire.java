import java.time.LocalDate;

public class ProduitsAlimentaire extends Produit {
   private LocalDate dateexpiration;

    public ProduitsAlimentaire(String nom, String description,int prix, LocalDate dateexpiration) {
        super(nom, description,prix);
        this.dateexpiration = dateexpiration;
    }

    public void afficher(){
       super.afficher();
        System.out.println("Date d'expriration"+ dateexpiration);
    }

    public LocalDate getDateexpiration() {
        return dateexpiration;
    }

    public void setDateexpiration(LocalDate dateexpiration) {
        this.dateexpiration = dateexpiration;
    }
}

public class Medicament {
    private int id;
    private String nom;
    private boolean enStock;

    public Medicament(String nom, boolean enStock) {
        this.nom = nom;
        this.enStock = enStock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public boolean isEnStock() {
        return enStock;
    }

    public void setEnStock(boolean enStock) {
        this.enStock = enStock;
    }

}

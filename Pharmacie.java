import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Pharmacie {
    private int id;
    private String nom;
    private String adresse;
    private String email;
    private List<Medicament> stock;

    public Pharmacie(String nom, String adresse, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.stock = new ArrayList<>();
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

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Medicament> getStock() {
        return stock;
    }

    public void setStock(List<Medicament> stock) {
        this.stock = stock;
    }

    public void ajouterMedicament(Medicament m) {
        assert m != null : "Erreur : le médicament ne peut pas être null.";
        int tailleAvant = stock.size();
        stock.add(m);
        assert stock.size() == tailleAvant + 1 : "Erreur : le médicament n’a pas été ajouté.";
    }

    public List<Medicament> rechercherParNom(String nom) {
        return stock.stream()
                .filter(m -> m.getNom().equalsIgnoreCase(nom))
                .collect(Collectors.toList());
    }

    public void afficherMedicamentsEnStock() {
        for (int i = 0; i < stock.size(); i++) {
            Medicament m = stock.get(i);
            if (m.isEnStock()) {
                System.out.println(m.getNom());
            }
        }
    }
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class PharmacieTest {

    public void testAjouterEtRechercherMedicament() {
        Pharmacie p = new Pharmacie("Pharmacie Centrale", "Monastir", "central@pharma.tn");
        Medicament m = new Medicament("Doliprane", true);
        p.ajouterMedicament(m);

        List<Medicament> result = p.rechercherParNom("doliprane");

        assertEquals(1, result.size());
        assertTrue(result.get(0).isEnStock());
    }
}

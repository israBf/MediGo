public class TestMedicament {
    public static void main(String[] args) {
        Medicament m1 = new Medicament("Doliprane", true);
        Medicament m2 = new Medicament("Efferalgan", false);
        Medicament m3 = new Medicament("Spasfon", true);

        Medicament[] testMedicaments = { m1, m2, m3, null };

        int disponibles = Medicament.compterMedicamentsDisponibles(testMedicaments);
        assert disponibles == 2 : "Devrait trouver 2 médicaments disponibles";

        System.out.println("Test réussi! Médicaments disponibles: " + disponibles);
    }
}

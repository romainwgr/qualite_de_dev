package romain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    Service s1;

    @BeforeEach
    void setUp() {
        s1 = new Service();
    }

    @Test
    public void testAjouter() {
        Voiture voiture = new Voiture("Renault",10000);
        s1.ajouter(voiture);
        Assertions.assertEquals(1, s1.voitures.size());
    }
    @Test
    public void testPrix() {
        s1.ajouter(new Voiture("Renault", 10000));
        s1.ajouter(new Voiture("Peugeot", 15000));
        s1.ajouter(new Voiture("Lamborghini", 20000));
        s1.ajouter(new Voiture("BMW", 25000));
        s1.ajouter(new Voiture("Mercedes", 5000000));

        // Cela devrait appliquer une remise aux 5 premières voitures
        int dernierPrix = s1.prix();
        Assertions.assertTrue(dernierPrix <= 20000, "Le prix après remise doit être inférieur ou égal à 20000");
    }
    public void main() {
        testAjouter();
        testPrix();
    }
}

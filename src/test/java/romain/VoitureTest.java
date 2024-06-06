package java.romain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.romain.Voiture;

public class VoitureTest {

    Voiture v1;

    @BeforeEach
    void setUp() {
        v1 = new Voiture();
    }
    @Test
    public static void testToString(){
        Voiture v1 = new Voiture("Renault",20000);
        Assertions.assertEquals("Je suis une Voiture Renault et je coûte 20000",
                v1.toString()
                );
        Assertions.assertEquals("Renault", v1.getMarque());
        Assertions.assertEquals(20000, v1.getPrix());
    }
    public static void main(String[] args) {
        testToString();
    }
}

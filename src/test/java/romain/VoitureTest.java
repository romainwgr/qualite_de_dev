package romain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VoitureTest {

            Voiture v1;

            @BeforeEach
            void setUp() {
                v1 = new Voiture();
            }

            @Test
            public void testToString(){
                v1.setPrix(20000);
                v1.setMarque("Renault");
                Assertions.assertEquals("Je suis une Voiture Renault et je coûte 20000",
                        v1.toString()
                );
            }
            @Test
            public void testGetPrix(){
                v1.setPrix(1000);
                Assertions.assertEquals(v1.getPrix(),1000);
            }
            @Test
            public void testGetMarque(){
                v1.setMarque("Ferrari");
                Assertions.assertEquals(v1.getMarque(),"Ferrari");
            }

            @Test



    public void main() {
        testToString();
    }
}

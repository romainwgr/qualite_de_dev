import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {

    @Test
    public static void testToString(){
        Voiture v1 = new Voiture("Renault",20000);
        assertEquals("Je suis une Voiture Renault et je coûte 20000",
                v1.toString()
                );
        assertEquals("Renault", v1.getMarque());
        assertEquals(20000, v1.getPrix());
    }
    public static void main(String[] args) {
        testToString();
    }
}

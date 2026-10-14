import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnit_Test
{
    @Test //fehler
    public void testPlaetzeZuWenig()
    {
        Boot boot = new Boot();

        boot.setPlaetze(0);

        assertEquals(0, boot.getPlaetze());
    }

    @Test //richtig
    public void testPlaetzeOk()
    {
        Boot boot = new Boot();

        boot.setPlaetze(100);

        assertEquals(100, boot.getPlaetze());
    }

    @Test //fehler
    public void testPlaetzeZuViel()
    {
        Boot boot = new Boot();

        boot.setPlaetze(6000);

        assertEquals(0, boot.getPlaetze());
    }
    
    @Test
    public void test_printBoot()
    {
        Boot seestern;
        seestern = new Boot("Seestern", 6, true);
        String sText = seestern.printBoot(); 
        
        Boot moewe;
        moewe = new Boot("Moewe", 4, false);
        String mText = moewe.printBoot();
        
        Boot poseidon;
        poseidon = new Boot("Poseidon", 12, true);
        String pText = poseidon.printBoot();
        
        assertEquals(sText,"Seestern Boot: 6 Plaetze - true");
        assertEquals(mText,"Moewe Boot: 4 Plaetze - false");
        assertEquals(pText,"Poseidon Boot: 12 Plaetze - true");
    }
}
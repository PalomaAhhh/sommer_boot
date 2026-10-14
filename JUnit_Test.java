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
}
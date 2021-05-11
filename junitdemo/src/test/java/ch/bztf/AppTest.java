package ch.bztf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppTest 
{
    
    @Test
    public void testFlaecheQuadrat()
    {
        GeoShapes geoShapes = new GeoShapes();
        double expected = 225;
        double actual = geoShapes.flaecheQuadrat(15.0);
        assertEquals(expected, actual, "Rechnet 15 * 15 um die Fläche eines Quadrates zu berechnen");
        
    }

    @Test
    public void testFlaecheRechteck()
    {
        GeoShapes geoShapes = new GeoShapes();
        double expected = 40;
        double actual = geoShapes.flaecheRechteck(5, 8);
        assertEquals(expected, actual, "Rechnet 5 * 8 um die Fläche eines Rechtecks zu berechnen");
    }

    @Test
    public void falschFlaecheRechtwinkligesDreieck()
    {
        GeoShapes geoShapes = new GeoShapes();
        double expected = 27;
        double actual = geoShapes.flaecheRechtwinkligesDreieck(9, 8);
        assertEquals(expected, actual, "Rechnet 9 * 8 / 2 um die Fläche eines rechtwinkligen Dreiecks zu berechnen (extra falsch für Testzwecke)");
    }

    @Test
    public void testFlaecheKreis()
    {
        GeoShapes geoShapes = new GeoShapes();
        double expected = 153.93804002589985;
        double actual = geoShapes.flaecheKreis(7);
        assertEquals(expected, actual, "Rechnet 7 * 7 * PI um die Fläche eines Kreises zu berechnen");
    }
}

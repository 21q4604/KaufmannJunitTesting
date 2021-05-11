package ch.bztf;


public class App 
{
    public static void main( String[] args )
    {
        GeoShapes quadrat = new GeoShapes();
        GeoShapes rechteck = new GeoShapes();
        GeoShapes rechtwinkligesDreieck = new GeoShapes();
        GeoShapes kreis = new GeoShapes();

        System.out.println("Fläche Quadrat : " + quadrat.flaecheQuadrat(5));
        System.out.println("Fläche Rechteck : " + rechteck.flaecheRechteck(45, 7));
        System.out.println("Fläche rechtwinkliges Dreieck : " + rechtwinkligesDreieck.flaecheRechtwinkligesDreieck(35, 4));
        System.out.println("Fläche Kreis : " + kreis.flaecheKreis(55));

    }
}

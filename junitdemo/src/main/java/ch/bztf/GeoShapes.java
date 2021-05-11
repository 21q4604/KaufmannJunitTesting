package ch.bztf;

public class GeoShapes {

    public double flaecheQuadrat(double seite){
        return seite * seite;
    }

    public double flaecheRechteck(double seiteA, double seiteB){
        return seiteA * seiteB;
    }

    public double flaecheRechtwinkligesDreieck(double seiteA, double seiteB){
        return seiteA * seiteB / 2;
    }

    public double flaecheKreis(double radius){
        return radius * radius * Math.PI;
    }

}

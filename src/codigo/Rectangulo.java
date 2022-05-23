package codigo;

public class Rectangulo {
    private double ancho = 1.0D;
    private double largo = 1.0D;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public Rectangulo() {}

    public double getAncho() {return ancho;}

    public void setAncho(double ancho) {this.ancho = ancho;}

    public double getLargo() {return largo;}

    public void setLargo(double largo) {this.largo = largo;}

    public double perimetroRectangulo(){ return (this.largo + this.ancho) * 2.0D;}

    public double areaRectangulo(){ return this.ancho*this.largo; }

    @Override
    public String toString() {
        return " Rectangulo " +
                " ancho :" + ancho +
                " largo :" + largo ;
    }

}

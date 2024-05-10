package top.anyel.figuras;

public class Rectangulo extends Figura{

    // atributos
    private double longitud;
    private double anchura;

    // constructores
    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }


    // métodos heredados con implementaciones distintas
    @Override
    public double calcularArea() {
        return longitud * anchura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }
}

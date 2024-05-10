package top.anyel.vehiculo;

public class Carro  extends Vehiculo{
    private int velocidad;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("El carro de marca " + marca + " modelo " + modelo + " ha acelerado. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        velocidad -= 10;
        System.out.println("El carro de marca " + marca + " modelo " + modelo + " ha frenado. Velocidad actual: " + velocidad + " km/h");
    }
}

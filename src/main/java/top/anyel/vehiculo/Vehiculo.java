package top.anyel.vehiculo;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();
    public abstract void frenar();
}

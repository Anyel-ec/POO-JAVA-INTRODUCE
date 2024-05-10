package top.anyel;

import top.anyel.figuras.Circulo;
import top.anyel.figuras.Figura;
import top.anyel.figuras.Rectangulo;
import top.anyel.vehiculo.Carro;
import top.anyel.vehiculo.Vehiculo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("Primer Ejercicio de POO");
        Figura rectangulo = new Rectangulo(5, 10);
        Figura circulo = new Circulo(7);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("****************************************************");
        System.out.println("Segundo Ejercicio de POO");
        Vehiculo carro = new Carro("Toyota", "Corolla");
        carro.acelerar();
        carro.frenar();
    }
}
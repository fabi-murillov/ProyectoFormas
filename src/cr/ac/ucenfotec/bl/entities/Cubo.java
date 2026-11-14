package cr.ac.ucenfotec.bl.entities;

import java.util.Arrays;

public class Cubo extends Cuerpo {

    private Cuadrado[] caras = new Cuadrado[6];

    // Constructor: seis caras cuadradas iguales
    public Cubo(Cuadrado cara) {
        for (int i = 0; i < caras.length; i++) {
            caras[i] = new Cuadrado(cara.getLado());
        }
    }

    // Getters
    public Cuadrado[] getCaras() { return caras; }

    public double getLado() { return caras[0].getLado(); }

    // Setters
    public void setLado(double lado) {
        for (Cuadrado cara : caras) {
            cara.setLado(lado);
        }
    }

    // Cada arista pertenece a dos caras
    public double calcularPerimetro() { return caras[0].calcularPerimetro() * 6 / 2; }

    public double calcularArea() { return caras[0].calcularArea() * 6; }

    public double calcularVolumen() { return caras[0].calcularArea() * getLado(); }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Arrays.equals(caras, ((Cubo) obj).caras);
    }

    // toString()
    public String toString() {
        return "Cubo\nLado: " + getLado();
    }
}

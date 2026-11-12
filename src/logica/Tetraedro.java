package logica;

import java.util.Arrays;

public class Tetraedro extends Cuerpo {

    private Equilatero[] caras = new Equilatero[4];

    // Constructor
    public Tetraedro(Equilatero cara) {
        for (int i = 0; i < caras.length; i++) {
            caras[i] = new Equilatero(cara.getLado());
        }
    }

    // Getters
    public Equilatero[] getCaras() { return caras; }

    public double getArista() { return caras[0].getLado(); }

    // Setters
    public void setArista(double arista) {
        for (Equilatero cara : caras) {
            cara.setLado(arista);
        }
    }

    public double calcularPerimetro() { return caras[0].calcularPerimetro() * 4 / 2; }

    public double calcularArea() { return caras[0].calcularArea() * 4; }

    public double calcularVolumen() { return Math.pow(getArista(), 3) / (6 * Math.sqrt(2)); }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Arrays.equals(caras, ((Tetraedro) obj).caras);
    }

    // toString()
    public String toString() {
        return "Tetraedro\nArista: " + getArista();
    }
}

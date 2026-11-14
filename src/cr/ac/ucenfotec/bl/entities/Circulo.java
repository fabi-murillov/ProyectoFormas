package cr.ac.ucenfotec.bl.entities;

public class Circulo extends Figura {

    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters
    public double getRadio() { return radio; }

    // Setters
    public void setRadio(double radio) { this.radio = radio; }

    public double calcularPerimetro() { return 2 * Math.PI * radio; }

    public double calcularArea() { return Math.PI * radio * radio; }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Double.compare(radio, ((Circulo) obj).radio) == 0;
    }

    // toString()
    public String toString() {
        return "Círculo\nRadio: " + radio;
    }
}

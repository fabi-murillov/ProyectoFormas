package cr.ac.ucenfotec.bl.entities;

public class Esfera extends Cuerpo {

    private double radio;

    // Constructor
    public Esfera(double radio) {
        this.radio = radio;
    }

    // Getters
    public double getRadio() { return radio; }

    // Setters
    public void setRadio(double radio) { this.radio = radio; }

    // El perímetro corresponde a la circunferencia máxima
    public double calcularPerimetro() { return 2 * Math.PI * radio; }

    public double calcularArea() { return 4 * Math.PI * radio * radio; }

    public double calcularVolumen() { return 4.0 / 3 * Math.PI * Math.pow(radio, 3); }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Double.compare(radio, ((Esfera) obj).radio) == 0;
    }

    // toString()
    public String toString() {
        return "Esfera\nRadio: " + radio;
    }
}

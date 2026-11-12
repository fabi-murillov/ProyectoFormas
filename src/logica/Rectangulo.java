package logica;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters
    public double getBase() { return base; }

    public double getAltura() { return altura; }

    // Setters
    public void setBase(double base) { this.base = base; }

    public void setAltura(double altura) { this.altura = altura; }

    public double calcularPerimetro() { return 2 * (base + altura); }

    public double calcularArea() { return base * altura; }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangulo otro = (Rectangulo) obj;
        return Double.compare(base, otro.base) == 0 && Double.compare(altura, otro.altura) == 0;
    }

    // toString()
    public String toString() {
        return "Rectángulo\nBase: " + base + "\nAltura: " + altura;
    }
}

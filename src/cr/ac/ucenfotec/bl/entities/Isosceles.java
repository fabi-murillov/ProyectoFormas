package cr.ac.ucenfotec.bl.entities;

public class Isosceles extends Triangulo {

    // Constructor
    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);
    }

    // Getters
    public double getLadoIgual() { return getLado1(); }

    public double getBase() { return getLado3(); }

    // Setters
    public void setLadoIgual(double ladoIgual) {
        setLado1(ladoIgual);
        setLado2(ladoIgual);
    }

    public void setBase(double base) { setLado3(base); }

    // toString()
    public String toString() {
        return "Triángulo isósceles\nLados iguales: " + getLadoIgual() + "\nBase: " + getBase();
    }
}

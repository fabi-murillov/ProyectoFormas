package logica;

public class Equilatero extends Triangulo {

    // Constructor
    public Equilatero(double lado) {
        super(lado, lado, lado);
    }

    // Getters
    public double getLado() { return getLado1(); }

    // Setters
    public void setLado(double lado) {
        setLado1(lado);
        setLado2(lado);
        setLado3(lado);
    }

    // toString()
    public String toString() {
        return "Triángulo equilátero\nLado: " + getLado();
    }
}

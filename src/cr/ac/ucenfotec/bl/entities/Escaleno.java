package cr.ac.ucenfotec.bl.entities;

public class Escaleno extends Triangulo {

    // Constructor
    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    // toString()
    public String toString() {
        return "Triángulo escaleno\nLado 1: " + getLado1() + "\nLado 2: " + getLado2()
            + "\nLado 3: " + getLado3();
    }
}

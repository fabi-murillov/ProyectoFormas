package cr.ac.ucenfotec.bl.entities;

public class Cuadrado extends Rectangulo {

    // Constructor
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    // Getters
    public double getLado() { return getBase(); }

    // Setters: la base y la altura siempre se mantienen iguales
    public void setLado(double lado) {
        super.setBase(lado);
        super.setAltura(lado);
    }

    public void setBase(double base) { setLado(base); }

    public void setAltura(double altura) { setLado(altura); }

    // toString()
    public String toString() {
        return "Cuadrado\nLado: " + getLado();
    }
}

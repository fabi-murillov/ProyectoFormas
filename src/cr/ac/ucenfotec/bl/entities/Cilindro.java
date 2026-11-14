package cr.ac.ucenfotec.bl.entities;

public class Cilindro extends Cuerpo {

    private Circulo base1;
    private Circulo base2;
    private Rectangulo lateral;

    // Constructor: dos bases circulares y una cara lateral rectangular
    public Cilindro(Circulo base, double altura) {
        base1 = new Circulo(base.getRadio());
        base2 = new Circulo(base.getRadio());
        lateral = new Rectangulo(base1.calcularPerimetro(), altura);
    }

    // Getters
    public Circulo getBase1() { return base1; }

    public Circulo getBase2() { return base2; }

    public Rectangulo getLateral() { return lateral; }

    public double getRadio() { return base1.getRadio(); }

    public double getAltura() { return lateral.getAltura(); }

    // Setters
    public void setRadio(double radio) {
        base1.setRadio(radio);
        base2.setRadio(radio);
        lateral.setBase(base1.calcularPerimetro());
    }

    public void setAltura(double altura) { lateral.setAltura(altura); }

    // Las aristas son las circunferencias de las bases
    public double calcularPerimetro() { return base1.calcularPerimetro() + base2.calcularPerimetro(); }

    public double calcularArea() { return base1.calcularArea() + base2.calcularArea() + lateral.calcularArea(); }

    public double calcularVolumen() { return base1.calcularArea() * lateral.getAltura(); }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cilindro otro = (Cilindro) obj;
        return base1.equals(otro.base1) && base2.equals(otro.base2) && lateral.equals(otro.lateral);
    }

    // toString()
    public String toString() {
        return "Cilindro\nRadio: " + getRadio() + "\nAltura: " + getAltura();
    }
}

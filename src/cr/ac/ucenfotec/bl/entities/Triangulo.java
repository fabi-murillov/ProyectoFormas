package cr.ac.ucenfotec.bl.entities;

public abstract class Triangulo extends Figura {

    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Crea el triángulo específico según las medidas de sus lados
    public static Triangulo crear(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Las medidas no forman un triángulo válido.");
        }
        if (a == b && b == c) return new Equilatero(a);
        if (a == b) return new Isosceles(a, c);
        if (a == c) return new Isosceles(a, b);
        if (b == c) return new Isosceles(b, a);
        return new Escaleno(a, b, c);
    }

    // Getters
    public double getLado1() { return lado1; }

    public double getLado2() { return lado2; }

    public double getLado3() { return lado3; }

    // Setters
    public void setLado1(double lado1) { this.lado1 = lado1; }

    public void setLado2(double lado2) { this.lado2 = lado2; }

    public void setLado3(double lado3) { this.lado3 = lado3; }

    public double calcularPerimetro() { return lado1 + lado2 + lado3; }

    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangulo otro = (Triangulo) obj;
        return lado1 == otro.lado1 && lado2 == otro.lado2 && lado3 == otro.lado3;
    }
}

package cr.ac.ucenfotec.bl.entities;

public abstract class Cuerpo implements Forma {

    public abstract double calcularVolumen();

    public void imprimirInformacion() {
        System.out.println(this);
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Volumen: %.2f%n", calcularVolumen());
        System.out.println();
    }
}

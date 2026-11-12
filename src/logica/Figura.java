package logica;

public abstract class Figura implements Forma {

    public void imprimirInformacion() {
        System.out.println(this);
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.println();
    }
}

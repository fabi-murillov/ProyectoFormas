package interfaz;

import java.util.Locale;
import java.util.Scanner;
import logica.*;

public class Menu {

    private Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    private Coleccion coleccion;

    // Constructor
    public Menu(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public void iniciar() {
        int opcion;
        do {
            System.out.println("1. Agregar figura");
            System.out.println("2. Agregar cuerpo");
            System.out.println("3. Listar figuras");
            System.out.println("4. Listar cuerpos");
            System.out.println("5. Calcular área total");
            System.out.println("6. Calcular perímetro total");
            System.out.println("7. Calcular volumen total");
            System.out.println("0. Salir");
            opcion = leerEntero("Opción: ");

            switch (opcion) {
                case 1: agregarFigura(); break;
                case 2: agregarCuerpo(); break;
                case 3: coleccion.listarFiguras(); break;
                case 4: coleccion.listarCuerpos(); break;
                case 5: System.out.printf("Área total: %.2f%n%n", coleccion.calcularAreaTotal()); break;
                case 6: System.out.printf("Perímetro total: %.2f%n%n", coleccion.calcularPerimetroTotal()); break;
                case 7: System.out.printf("Volumen total: %.2f%n%n", coleccion.calcularVolumenTotal()); break;
                case 0: System.out.println("Fin del programa."); break;
                default: System.out.println("Opción inválida.\n");
            }
        } while (opcion != 0);
    }

    private void agregarFigura() {
        System.out.println("1. Círculo  2. Rectángulo  3. Cuadrado  4. Rombo  5. Triángulo");
        int tipo = leerEntero("Figura: ");
        Figura figura;
        switch (tipo) {
            case 1: figura = new Circulo(leerDecimal("Radio: ")); break;
            case 2: figura = new Rectangulo(leerDecimal("Base: "), leerDecimal("Altura: ")); break;
            case 3: figura = new Cuadrado(leerDecimal("Lado: ")); break;
            case 4: figura = new Rombo(leerDecimal("Diagonal mayor: "), leerDecimal("Diagonal menor: ")); break;
            case 5:
                try {
                    figura = Triangulo.crear(leerDecimal("Lado 1: "), leerDecimal("Lado 2: "), leerDecimal("Lado 3: "));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + "\n");
                    return;
                }
                break;
            default:
                System.out.println("Opción inválida.\n");
                return;
        }
        coleccion.agregarFigura(figura);
        System.out.println("Figura agregada.\n");
    }

    private void agregarCuerpo() {
        System.out.println("1. Cubo  2. Cilindro  3. Tetraedro  4. Esfera");
        int tipo = leerEntero("Cuerpo: ");
        Cuerpo cuerpo;
        switch (tipo) {
            case 1: cuerpo = new Cubo(new Cuadrado(leerDecimal("Lado: "))); break;
            case 2: cuerpo = new Cilindro(new Circulo(leerDecimal("Radio: ")), leerDecimal("Altura: ")); break;
            case 3: cuerpo = new Tetraedro(new Equilatero(leerDecimal("Arista: "))); break;
            case 4: cuerpo = new Esfera(leerDecimal("Radio: ")); break;
            default:
                System.out.println("Opción inválida.\n");
                return;
        }
        coleccion.agregarCuerpo(cuerpo);
        System.out.println("Cuerpo agregado.\n");
    }

    private int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!entrada.hasNextInt()) {
            entrada.next();
            System.out.print("Ingrese un número entero: ");
        }
        return entrada.nextInt();
    }

    private double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        while (!entrada.hasNextDouble()) {
            entrada.next();
            System.out.print("Ingrese un número: ");
        }
        return entrada.nextDouble();
    }
}

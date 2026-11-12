package logica;

import java.util.ArrayList;

public class Coleccion {

    private ArrayList<Figura> figuras = new ArrayList<>();
    private ArrayList<Cuerpo> cuerpos = new ArrayList<>();

    // Getters
    public ArrayList<Figura> getFiguras() { return figuras; }

    public ArrayList<Cuerpo> getCuerpos() { return cuerpos; }

    // Setters
    public void setFiguras(ArrayList<Figura> figuras) { this.figuras = figuras; }

    public void setCuerpos(ArrayList<Cuerpo> cuerpos) { this.cuerpos = cuerpos; }

    public void agregarFigura(Figura figura) { figuras.add(figura); }

    public void agregarCuerpo(Cuerpo cuerpo) { cuerpos.add(cuerpo); }

    public void listarFiguras() {
        for (Figura figura : figuras) {
            figura.imprimirInformacion();
        }
    }

    public void listarCuerpos() {
        for (Cuerpo cuerpo : cuerpos) {
            cuerpo.imprimirInformacion();
        }
    }

    public double calcularPerimetroTotal() {
        double total = 0;
        for (Figura figura : figuras) total += figura.calcularPerimetro();
        for (Cuerpo cuerpo : cuerpos) total += cuerpo.calcularPerimetro();
        return total;
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (Figura figura : figuras) total += figura.calcularArea();
        for (Cuerpo cuerpo : cuerpos) total += cuerpo.calcularArea();
        return total;
    }

    public double calcularVolumenTotal() {
        double total = 0;
        for (Cuerpo cuerpo : cuerpos) total += cuerpo.calcularVolumen();
        return total;
    }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Coleccion)) return false;
        Coleccion otra = (Coleccion) obj;
        return figuras.equals(otra.figuras) && cuerpos.equals(otra.cuerpos);
    }

    // toString()
    public String toString() {
        return "Colección\nFiguras: " + figuras.size() + "\nCuerpos: " + cuerpos.size();
    }
}

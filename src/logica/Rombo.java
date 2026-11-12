package logica;

public class Rombo extends Figura {

    private double diagonalMayor;
    private double diagonalMenor;

    // Constructor
    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    // Getters
    public double getDiagonalMayor() { return diagonalMayor; }

    public double getDiagonalMenor() { return diagonalMenor; }

    public double getLado() {
        return Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
    }

    // Setters
    public void setDiagonalMayor(double diagonalMayor) { this.diagonalMayor = diagonalMayor; }

    public void setDiagonalMenor(double diagonalMenor) { this.diagonalMenor = diagonalMenor; }

    public double calcularPerimetro() { return 4 * getLado(); }

    public double calcularArea() { return diagonalMayor * diagonalMenor / 2; }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rombo otro = (Rombo) obj;
        return Double.compare(diagonalMayor, otro.diagonalMayor) == 0
            && Double.compare(diagonalMenor, otro.diagonalMenor) == 0;
    }

    // toString()
    public String toString() {
        return "Rombo\nDiagonal mayor: " + diagonalMayor + "\nDiagonal menor: " + diagonalMenor;
    }
}

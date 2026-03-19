public class Rectangulo {

    public double ancho;
    public double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    public void dibujar() {
        System.out.println("Dibujando rectangulo " + ancho + "x" + alto);
    }
}
public class Rectangulo {

    private double ancho;
    private double alto;

    protected Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return getAncho() * getAlto();
    }

    public double calcularPerimetro() {
        return 2 * getAncho() + 2 * getAlto();
    }

    public void dibujar() {
        System.out.println("Dibujando rectangulo " + getAncho() + "x" + getAlto());
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}
public class Rectangulo extends FigurasSimples implements MetodosGeometricos {

    protected Rectangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    @Override
    public double calcularArea() {
        return getAncho() * getAlto();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * getAncho() + 2 * getAlto();
    }

    public void dibujar() {
        System.out.println("Dibujando rectangulo " + getAncho() + "x" + getAlto());
    }

}
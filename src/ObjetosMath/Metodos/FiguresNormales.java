package ObjetosMath.Metodos;

public abstract class FiguresNormales {
    protected double ancho;
    protected double alto;
    /**
     * @param ancho
     * Es utilizada por las clases Rectángulo y Triángulo
     * @see ObjetosMath.Figuras.Rectangulo
     * @see ObjetosMath.Figuras.Triangulo
     * */
    public FiguresNormales(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}

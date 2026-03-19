package ObjetosMath.Metodos;

public abstract class FiguresNormales {
    protected double ancho;
    protected double alto;

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

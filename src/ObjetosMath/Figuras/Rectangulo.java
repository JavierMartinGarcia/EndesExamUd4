package ObjetosMath.Figuras;

import ObjetosMath.Metodos.FiguresNormales;
import ObjetosMath.Metodos.MetodosGeometricos;

public class Rectangulo extends FiguresNormales implements MetodosGeometricos {
    /**
     * @see FiguresNormales
     * @since Versión bad smell
     * @param ancho
     * Se trata del ancho del rectángulo
     * @param alto
     * Se trata del alto del rectángulo
     * */
    public Rectangulo(double ancho, double alto) {
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
    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo " + getAncho() + "x" + getAlto());
    }

}
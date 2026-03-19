package ObjetosMath.Figuras;

import ObjetosMath.Metodos.FiguresNormales;
import ObjetosMath.Metodos.MetodosGeometricos;

public class Triangulo extends FiguresNormales implements MetodosGeometricos {
    private double lado1;
    private double lado2;
    private double lado3;
    /**
     * @see FiguresNormales
     * @see MetodosGeometricos
     * @since Versión bad smell
     * @param l1
     * consta del primer lado que tiene el triángulo
     * @param l2
     * consta del segundo lado que tiene el triángulo
     * @param l3
     * consta del tercer lado que tiene el triángulo
     * @param base
     * Se trata de la base que del triangulo
     * @param altura
     * Se trata de la altura del triángulo
     * */
    public Triangulo(double base, double altura, double l1, double l2, double l3) {
        super(base,altura);
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return getLado1() + getLado2() + getLado3();
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }

    public double getBase() {
        return super.getAncho();
    }

    public double getAltura() {
        return super.getAlto();
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
}
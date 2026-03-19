public class Triangulo {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    protected Triangulo(double base, double altura, double l1, double l2, double l3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }

    public double calcularPerimetro() {
        return getLado1() + getLado2() + getLado3();
    }

    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
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
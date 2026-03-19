public class Circulo implements MetodosGeometricos{

    private double radio;

    protected Circulo(double radio) {
        this.setRadio(radio);
    }
    @Override
    public double calcularArea() {
        return 3.1416 * getRadio() * getRadio();
    }
    @Override
    public double calcularPerimetro() {
        return 2 * 3.1416 * getRadio();
    }

    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + getRadio());
    }

    public double getRadio() {
        return radio;
    }

    protected void setRadio(double radio) {
        if (radio <= 0){
            throw new IllegalArgumentException("Radio introducido no válido");
        } else {
            this.radio = radio;
        }
    }
}
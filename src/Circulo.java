public class Circulo {

    private double radio;

    protected Circulo(double radio) {
        this.setRadio(radio);
    }

    protected double calcularArea() {
        return 3.1416 * getRadio() * getRadio();
    }

    protected double calcularPerimetro() {
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
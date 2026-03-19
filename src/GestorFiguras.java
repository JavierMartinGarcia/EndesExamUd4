import java.util.ArrayList;

public class GestorFiguras {

    private ArrayList<Object> figuras;

    public GestorFiguras() {
        setFiguras(new ArrayList<>());
    }

    public void agregarFigura(Object f) {
        getFiguras().add(f);
    }

    public void mostrarAreas() {

        for (Object f : getFiguras()) {
            // horrible uso de instanceof
            if (f instanceof Circulo) {
                System.out.println("Area circulo: " + ((Circulo) f).calcularArea());
            }else if(f instanceof Rectangulo) {
                System.out.println("Area rectangulo: " + ((Rectangulo) f).calcularArea());
            }else{
                System.out.println("Area triangulo: " + ((Triangulo) f).calcularArea());
            }
        }
    }

    public void mostrarPerimetros() {

        for (Object f : getFiguras()) {

            if (f instanceof Circulo) {
                System.out.println("Perimetro circulo: " + ((Circulo) f).calcularPerimetro());
            }else if(f instanceof Rectangulo) {
                System.out.println("Perimetro rectangulo: " + ((Rectangulo) f).calcularPerimetro());
            } else {
                System.out.println("Perimetro triangulo: " + ((Triangulo) f).calcularPerimetro());
            }
        }
    }

    public void dibujarTodo() {

        for (Object f : getFiguras()) {

            if (f instanceof Circulo) {
                ((Circulo) f).dibujar();
            } else if (f instanceof Rectangulo) {
                ((Rectangulo) f).dibujar();
            }else {
                ((Triangulo) f).dibujar();
            }
        }
    }

    public ArrayList<Object> getFiguras() {
        return figuras;
    }

    private void setFiguras(ArrayList<Object> figuras) {
        this.figuras = figuras;
    }
}
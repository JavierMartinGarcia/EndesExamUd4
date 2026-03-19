import ObjetosMath.Figuras.Circulo;
import ObjetosMath.Figuras.Triangulo;
import ObjetosMath.Gestor.GestorFiguras;

public class Main {
/**
 * @author Javier Martín García
 * Esta clase se creó más que nada para demostrar que el código funciona
 * */
    public static void main(String[] args) {

        GestorFiguras gestor = new GestorFiguras();

        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(3, 4, 3, 4, 5);

        gestor.agregarFigura(c);
        gestor.agregarFigura(4,6);
        gestor.agregarFigura(t);

        System.out.println("---- AREAS ----");
        gestor.mostrarAreas();

        System.out.println("---- PERIMETROS ----");
        gestor.mostrarPerimetros();

        System.out.println("---- DIBUJAR ----");
        gestor.dibujarTodo();
    }
}
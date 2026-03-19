public class Main {

    public static void main(String[] args) {

        GestorFiguras gestor = new GestorFiguras();

        Circulo c = new Circulo(5);
        Rectangulo r = new Rectangulo(4, 6);
        Triangulo t = new Triangulo(3, 4, 3, 4, 5);

        gestor.agregarFigura(c);
        gestor.agregarFigura(r);
        gestor.agregarFigura(t);

        System.out.println("---- AREAS ----");
        gestor.mostrarAreas();

        System.out.println("---- PERIMETROS ----");
        gestor.mostrarPerimetros();

        System.out.println("---- DIBUJAR ----");
        gestor.dibujarTodo();
    }
}
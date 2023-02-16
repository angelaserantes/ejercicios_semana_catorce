

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 5);
        Punto p3 = new Punto(5, 5);
        Punto p4 = new Punto(5, 0);



        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setVertices(p1, p2, p3, p4);
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setVertices(p1, p2, p3, p4);
        Triangulo triangulo = new Triangulo();
        triangulo.setVertices(p1, p2, p3);

        Forma[] formas = new Forma[3];
        formas[0] = cuadrado;
        formas[1] = rectangulo;
        formas[2] = triangulo;

        for (Forma forma : formas) {
           forma.dibujar_puntos();
            // forma.rellenar_forma();
            System.out.println("Área: " + forma.calcular_area());
            System.out.println("Perímetro: " + forma.calcular_perimetro());
        }
    }
}
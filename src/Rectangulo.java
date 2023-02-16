import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class Rectangulo extends Cuadrilatero implements Forma {
    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super.setVertices(p1, p2, p3, p4);
    }

    public Rectangulo() {

    }

    @Override
    public void dibujar_puntos() {
        //Punto[] vertices = this.getVertices();
        //        System.out.println("Dibujando puntos del rectángulo:");
        //for (int i = 0; i < vertices.length; i++) {
          //  System.out.println("Punto " + (i + 1) + ": (" + vertices[i].pos_x + ", " + vertices[i].pos_y + ")");
        //}

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Punto[] vertices = Rectangulo.this.getVertices();
                for (Punto punto : vertices) {
                    g.fillOval(punto.pos_x, punto.pos_y, 5, 5);
                }
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void rellenar_forma() {
        System.out.println("Rellenando forma del rectángulo...");
    }

    @Override
    public double calcular_area() {
        Punto[] vertices = this.getVertices();
        double base = Math.sqrt(Math.pow(vertices[1].pos_x - vertices[0].pos_x, 2) +
                Math.pow(vertices[1].pos_y - vertices[0].pos_y, 2));
        double altura = Math.sqrt(Math.pow(vertices[3].pos_x - vertices[0].pos_x, 2) +
                Math.pow(vertices[3].pos_y - vertices[0].pos_y, 2));
        System.out.println("El área del rectángulo es: " + base * altura);
        return base * altura;
    }

    @Override
    public double calcular_perimetro() {
        Punto[] vertices = this.getVertices();
        double base = Math.sqrt(Math.pow(vertices[1].pos_x - vertices[0].pos_x, 2) +
                Math.pow(vertices[1].pos_y - vertices[0].pos_y, 2));
        double altura = Math.sqrt(Math.pow(vertices[3].pos_x - vertices[0].pos_x, 2) +
                Math.pow(vertices[3].pos_y - vertices[0].pos_y, 2));
        System.out.println("El perímetro del rectángulo es: " + 2 * (base + altura));
        return 2 * (base + altura);
    }
}

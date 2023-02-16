import javax.swing.*;
import java.awt.*;

public class Triangulo extends Trigono implements  Forma{
    @Override
    public void dibujar_puntos() {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Punto[] vertices = Triangulo.this.getVertices();
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

    }

    @Override
    public double calcular_area() {
        Punto[] vertices = this.getVertices();
        double base = Math.sqrt(Math.pow(vertices[1].pos_x - vertices[0].pos_x, 2) +
                Math.pow(vertices[1].pos_y - vertices[0].pos_y, 2));
        double altura = Math.sqrt(Math.pow(vertices[2].pos_x - vertices[0].pos_x, 2) +
                Math.pow(vertices[2].pos_y - vertices[0].pos_y, 2));
        System.out.println("El área del triangulo es: " + base * altura/2);
        return base * altura/2;
    }

    @Override
    public double calcular_perimetro() {
        //Triangulo equilatero
        Punto[] vertices = this.getVertices();
        double lado = Math.sqrt(Math.pow(vertices[1].pos_x - vertices[0].pos_x, 2) +
                Math.pow(vertices[1].pos_y - vertices[0].pos_y, 2));
        System.out.println("El perimetro del triangulo es: " + lado*lado*lado);
        return lado*lado*lado;

    }
}

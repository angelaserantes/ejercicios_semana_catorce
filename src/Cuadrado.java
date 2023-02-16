import java.awt.*;
import javax.swing.*;

public class Cuadrado extends Cuadrilatero implements Forma {
    private double lado;

    public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {
        super.setVertices(p1, p2, p3, p4);



    }

    public Cuadrado() {

    }


    @Override
    public void dibujar_puntos() {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Punto[] vertices = Cuadrado.this.getVertices();
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
        System.out.println("Rellenando el cuadrado...");
    }

    @Override
    public double calcular_area() {
        Punto[] vertices = this.getVertices();

        lado= Math.sqrt(Math.pow(vertices[1].pos_x - vertices[0].pos_x, 2) + Math.pow(vertices[1].pos_y - vertices[0].pos_y, 2));
        System.out.println("el lado es + " + this.lado);
        System.out.println("El área del cuadrado es: " + lado * lado);
        return lado * lado;
    }

    @Override
    public double calcular_perimetro() {
        return this.lado * 4;
    }


}

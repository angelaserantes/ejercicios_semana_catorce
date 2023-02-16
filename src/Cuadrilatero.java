public abstract class Cuadrilatero {
    private Punto [] vertices = new Punto[4];

    public Punto[] getVertices (){ return this.vertices;}

    public void setPuntos(Punto [] vertices){ this.vertices = vertices;}

    public void setVertices(Punto p1, Punto p2, Punto p3, Punto p4){
        this.vertices[0] = p1;
        this.vertices[1] = p2;
        this.vertices[2] = p3;
        this.vertices[3] = p4;

 }



}

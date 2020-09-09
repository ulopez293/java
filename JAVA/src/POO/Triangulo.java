package POO;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    public Triangulo(double b, double h) {
        super("Triangulo");  //constructor del padre
        base = b;
        altura = h;
    }
    public double area(){
        return base*altura/2;
    }
}

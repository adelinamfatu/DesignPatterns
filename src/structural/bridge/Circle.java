package structural.bridge;

//Clasa RefinedAbstraction
//Clasa concreta cu caracteristici proprii ce extinde clasa abstracta
public class Circle extends Shape {
    private double x, y, radius;

    public Circle(double x, double y, double radius, DrawingImplementor drawingImplementor) {
        super(drawingImplementor);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        implementor.drawCircle(x, y, radius);
    }
}

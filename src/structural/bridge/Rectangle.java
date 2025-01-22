package structural.bridge;

public class Rectangle extends Shape {
    private double x, y, width, height;

    public Rectangle(double x, double y, double width, double height, DrawingImplementor drawingImplementor) {
        super(drawingImplementor);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        implementor.drawRectangle(x, y, width, height);
    }
}

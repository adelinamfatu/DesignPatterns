package structural.bridge;

//ConcreteImplementorA
//Implementeaza interfata
public class VectorDrawing implements DrawingImplementor {
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle in vector mode at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("Drawing rectangle in vector mode at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}

package structural.bridge;

//ConcreteImplementorB
//Implementeaza interfata
public class RasterDrawing implements DrawingImplementor {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle in raster mode at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("Drawing rectangle in raster mode at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}

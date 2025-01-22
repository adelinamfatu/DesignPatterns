package structural.bridge;

//Interfata Implementor
//Defineste metode de nivel scazut
public interface DrawingImplementor {
    void drawCircle(double x, double y, double radius);
    void drawRectangle(double x, double y, double width, double height);
}

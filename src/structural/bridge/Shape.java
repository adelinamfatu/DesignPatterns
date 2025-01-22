package structural.bridge;

//Clasa Abstraction
//Defineste metode de nivel inalt - draw
//Clasa abstracta ce contine un obiect de tip implementor protected ca sa poata fi accesat de clasele derivate
public abstract class Shape {
    protected DrawingImplementor implementor;

    public Shape(DrawingImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void draw();
}

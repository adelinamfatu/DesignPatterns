package structural.bridge;

//Se dorește dezvoltarea unui sistem pentru desenarea formelor geometrice (cum ar fi cercuri și dreptunghiuri),
//care să fie independent de modul în care acestea sunt desenate (de exemplu, în mod vectorial sau raster).
//Formele și modul de desenare sunt două ierarhii separate, iar dacă vrem să adăugăm o nouă formă sau un nou mod de desenare,
//ar fi necesară extinderea ambelor ierarhii, ceea ce ar duce la o explozie de clase.

public class Main {
    public static void main(String[] args) {
        Shape vectorCircle = new Circle(5, 10, 15, new VectorDrawing());
        vectorCircle.draw();

        Shape rasterRectangle = new Rectangle(2, 4, 10, 20, new RasterDrawing());
        rasterRectangle.draw();
    }
}

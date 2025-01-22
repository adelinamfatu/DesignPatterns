package comportamental.iterator;

//Implementează un iterator pentru o colecție de cărți dintr-o bibliotecă.
//Vei crea un iterator care să permită parcurgerea colecției de cărți și accesarea fiecărei cărți din listă într-un mod ordonat.

public class Main {
    public static void main(String[] args) {
        String[] books = {"Cartea 1", "Cartea 2", "Cartea 3", "Cartea 4"};
        ConcreteLibrary library = new ConcreteLibrary(books);

        BookIterator iterator = library.createIterator();

        while (iterator.hasNext()) {
            System.out.println("Citind: " + iterator.next());
        }
    }
}

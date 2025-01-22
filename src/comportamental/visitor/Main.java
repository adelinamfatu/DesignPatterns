package comportamental.visitor;

//Implementează un sistem în care un Vizitator poate aplica diferite acțiuni asupra mai multor tipuri de elemente
//dintr-o structură, cum ar fi un Sistem de Produse dintr-un magazin online. Avem două tipuri de produse:
//Carte și Telefon. Vizitatorul va aplica o reducere specifică pe fiecare tip de produs.
//Utilizăm pattern-ul Visitor pentru a face extensibil acest sistem, astfel încât să putem adăuga noi acțiuni
//fără a modifica clasele existente ale produselor.

public class Main {
    public static void main(String[] args) {
        ProductStore store = new ProductStore();
        store.addProduct(new Book(50.0));
        store.addProduct(new Phone(300.0));

        //Crearea vizitatorilor
        Visitor bookDiscountVisitor = new BookDiscountVisitor();
        Visitor phoneDiscountVisitor = new PhoneDiscountVisitor();

        //Aplicarea reducerii pentru cărți
        System.out.println("Aplicăm reducere pentru cărți:");
        store.accept(bookDiscountVisitor);

        //Aplicarea reducerii pentru telefoane
        System.out.println("Aplicăm reducere pentru telefoane:");
        store.accept(phoneDiscountVisitor);
    }
}

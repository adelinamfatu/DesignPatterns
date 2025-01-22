package comportamental.visitor;

public class BookDiscountVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        book.applyDiscount(0.10);  //Reducere de 10% pentru cărți
    }

    @Override
    public void visit(Phone phone) {
        //Nu aplicăm reducere pentru telefoane în acest vizitator
    }
}

package comportamental.visitor;

public class PhoneDiscountVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        // Nu aplicăm reducere pentru cărți în acest vizitator
    }

    @Override
    public void visit(Phone phone) {
        phone.applyDiscount(0.15);  // Reducere de 15% pentru telefoane
    }
}

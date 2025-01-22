package comportamental.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Phone phone);
}

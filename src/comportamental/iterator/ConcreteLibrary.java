package comportamental.iterator;

public class ConcreteLibrary implements Library {
    private String[] books;

    public ConcreteLibrary(String[] books) {
        this.books = books;
    }

    @Override
    public BookIterator createIterator() {
        return new ConcreteBookIterator(books);
    }
}

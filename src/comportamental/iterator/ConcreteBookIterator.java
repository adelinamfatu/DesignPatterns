package comportamental.iterator;

public class ConcreteBookIterator implements BookIterator {
    private String[] books;
    private int position = 0;

    public ConcreteBookIterator(String[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.length;
    }

    @Override
    public String next() {
        return books[position++];
    }
}

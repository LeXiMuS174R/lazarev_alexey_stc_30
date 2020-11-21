package HomeWork13;

// не гарантирует порядок элементов
public interface Collection<J> extends java.lang.Iterable<J> {
    void add(J element);

    boolean contains(J element);

    int size();

    void removeFirst(J element);
}

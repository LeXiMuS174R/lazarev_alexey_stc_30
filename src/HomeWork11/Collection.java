package HomeWork11;

// не гарантирует порядок элементов
public interface Collection extends Iterable {
    void add(int element);
    boolean contains(int element);
    int size();
    void removeFirst(int element);
}

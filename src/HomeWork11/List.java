package HomeWork11;

public interface List extends Collection {
    int get(int index);

    int indexOf(int element);

    void removeByIndex(int index);

    void insert(int element, int index);

    void reverse();

    void PrintArray();
}

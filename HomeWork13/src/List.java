public interface List<L> extends Collection<L> {
    L get(int index);

    int indexOf(L element);

    void removeByIndex(int index);

    void insert(L element, int index);

    void reverse();

    void PrintArray();
}

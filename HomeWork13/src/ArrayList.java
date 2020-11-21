import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_SIZE = 10;
    private T data[];
    private int count;

    public ArrayList() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    private class ArrayListIterator<T> implements Iterator<T> {

        private int current = 0;

        @Override
        public T next() {
            T value = (T) data[current];
            current++;
            return value;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }

    @Override
    public T get(int index) {
        if (index < count) {
            return this.data[index];
        }
        System.err.println("Вышли за пределы массива");
        return null;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < count; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void removeByIndex(int index) {
        for (int i = index; i < count; i++)
            data[i] = data[i + 1];
        data[count] = null;
        count--;
    }

    @Override
    public void insert(T element, int index) {
        if (count == data.length - 1) {
            resize();
        }
        for (int i = count - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        count++;
    }

    @Override
    public void reverse() {
        T value;
        for (int i = 0; i < count / 2; i++) {
            value = data[i];
            data[i] = data[count - 1 - i];
            data[count - 1 - i] = value;
        }
    }

    @Override
    public void PrintArray() {

    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "data=" + Arrays.toString(data) +
                ", count=" + count +
                '}';
    }

    @Override
    public void add(T element) {
        if (count == data.length - 1) {
            resize();
        }
        data[count] = element;
        count++;
    }

    private void resize() {
        int oldLength = this.data.length;
        int newLength = oldLength + (oldLength >> 1);
        T newData[] = (T[]) new Object[newLength];

        System.arraycopy(this.data, 0, newData, 0, oldLength);

        this.data = newData;
    }


    @Override
    public int size() {
        return this.count;
    }

    @Override
    public void removeFirst(T element) {
        int indexOfRemovingElement = indexOf(element);

        for (int i = indexOfRemovingElement; i < count - 1; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.count--;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator<>();
    }
}

public class LinkedList<J> implements List<J> {

    private class LinkedListIterator<J> implements Iterator<J> {

        @Override
        public J next() {
            return null;
        }

        @Override
        public boolean hasNext() {
            return false;
        }
    }

    private Node<J> first;
    private Node<J> last;

    private int count;

    private static class Node<H> {
        H value;
        Node<H> next;

        public Node(H value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    @Override
    public void reverse() { // разворот списка
        int[] array = new int[count];
        Node current = first;
        int i = 0;
        while (current != null) {
            array[i] = (int) current.value;
            current = current.next;
            i++;
        }
        first = new Node(array.length);
        current = first;
        for (int j = array.length - 2; j >= 0; j--) {
            current.next = new Node(array[j]);
            current = current.next;
        }
    }

    @Override
    public J get(int index) {
        if (index >= 0 && index < count && first != null) {
            int i = 0;
            Node current = this.first;

            while (i < index) {
                current = current.next;
                i++;
            }

            return (J) current.value;
        }
        System.err.println("Такого элемента нет");
        return null;


    }

    @Override
    public void PrintArray() { // вывод списка

        Node current = first;
        System.out.println(current.value);

        while (current != null) {
            current = current.next;
            System.out.println(current.value);
            if (current.next == null) {
                break;
            }
        }
    }

    @Override
    public int indexOf(J element) {
        int i = 0;
        Node current = this.first;

        while (current != null && current.value != element) {
            current = current.next;
            i++;
        }

        if (current == null) {
            return -1;
        } else {
            return i;
        }
    }

    @Override
    public void removeByIndex(int index) {
        Node previous = this.first;
        Node current = previous.next;
        int i = 1;

        if (index == 0 && index < count && first != null) {
            first = first.next;
            System.out.println("Цифра '" + previous.value + "' удалена ✔");
            count--;
        } else {
            while (current != null && i != index) {
                i++;
                previous = previous.next;
                current = current.next;
            }
            if (i == index) {
                previous.next = current.next;
                System.out.println("Цифра '" + current.value + "' удалена ✔");
                count--;
            } else {
                System.err.println("Элемент под индексом " + index + " не найден ✘");
            }
        }
    }

    @Override
    public void insert(J element, int index) {
        int i = 1;
        Node previous = this.first;
        Node current = previous.next;

        if (index < count) {
            while (current != null && i != index) {
                previous = previous.next;
                current = current.next;
                i++;
            }
            if (current != null && i == index) {
                previous.next = new Node(element);
                previous.next.next = current;
                i++;
                count++;
            }
        } else {
            System.err.println("Операция insert - не может быть исполнена! Вы вывалились за массив");
        }
    }

    @Override
    public void add(J element) {
        Node newNode = new Node(element);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            // следующий после последнего - новый узел
            last.next = newNode;
            // новый узел теперь последний
            last = newNode;
        }
        count++;
    }

    @Override
    public boolean contains(J element) {
        Node current = this.first;
        while (current != null) {
            if (current.value == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void removeFirst(J element) {
        Node previous = this.first;
        Node current = previous.next;

        if (first != null && first.value == element) {
            first = first.next;
            System.out.println("Элемент '" + element + "' удален ✔");
            count--;
        } else {
            while (current != null && current.value != element) {
                previous = previous.next;
                current = current.next;
            }
            if (current != null && current.value == element) {
                previous.next = current.next;
                System.out.println("Элемент '" + element + "' удален ✔");
                count--;
            } else {
                System.err.println("Элемент '" + element + "' не найден ✘");
            }
        }
    }

    @Override
    public Iterator<J> iterator() {
        return new LinkedListIterator<>();
    }
}

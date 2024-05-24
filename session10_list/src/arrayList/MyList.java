package arrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add (E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void addE(int index, E element) {
        if (index <= size && index >= 0) {
            size++;

            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
        }
    }

    public E remove(int index) {
        E element = (E) elements[index];
        if (index <= size && index >= 0) {

            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        return element;
    }

    public int size() {
        return size;
    }

    public Object clone() {
        Object newElements[] = new Object[size];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        return newElements;
    }

    public boolean contains(E object) {
        for (Object o : elements) {
            if (object == o) return true;
        }
        return false;
    }

    public int indexOf(E object) {
        for (int i = 0; i < size; i++) {
            if (object == elements[i]) return i;
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}

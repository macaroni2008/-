package task1;

public class genericstack<E> {
    private E[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public genericstack() {
        array = (E[]) new Object[10];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[size - 1];
    }

    public void push(E o) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = o;
    }

    public E pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        E o = array[--size];
        array[size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private void resizeArray() {
        E[] newArray = (E[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
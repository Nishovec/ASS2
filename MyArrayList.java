public class MyArrayList<E> implements MyList<E> {
    private Object[] elements;
    private int size;

    public class MyArrayList() {
        elements = new Object[10];
        size =0;
    }

    public void add(E element) {
        if (size== elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i=0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }
    public E get(int index) {
        if (index < 0) || index >= size) {
    throw new IndexOutOfBoundsException();
        }
        return(E) elements[index];

    }
}

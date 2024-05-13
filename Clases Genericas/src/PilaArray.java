import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] array;
    private int counter;

    //Recibimos como parametro el tamaño maximo para el array y realizamos el constructor
    public PilaArray(int maxSize) {
        array = (E[]) new Object[maxSize];
        counter = 0;
    }

    //Revisamos si el array esta vacio
    public boolean isEmpty() {
        return counter == 0;
    }

    //Metodo para chequear si hay un espacio libre en el array y añadir un elemento
    public boolean add(E element) {
        if (counter < array.length) {
            array[counter] = element;
            counter++;
            return true;
        } else {
            return false;
        }
    }

    //Metodo para devolver el elemento en la posicion del contador
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila esta vacia");
        }
        return array[counter - 1];
    }

    //Metodo para extraer un elemento
    public E extract() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        counter--;
        return array[counter];
    }

    //Metodo toString sobreescrito
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < counter; i++) {
            sb.append(array[i]);
            if (i < counter - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

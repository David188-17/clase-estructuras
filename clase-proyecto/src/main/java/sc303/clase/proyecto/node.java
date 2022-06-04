
package sc303.clase.proyecto;

// la T es para poder desde el main elegir el tipo de variable que vamos a utilizar 
// una variable tipo T puede ser cualquiera que escogamos
public class node<T> {

    private T value;
    private node<T> next;

    public node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {//este metodo es el que envia el nuevo valor
        this.next = next;
    }

}

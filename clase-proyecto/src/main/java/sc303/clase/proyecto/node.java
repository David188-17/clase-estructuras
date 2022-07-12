
package sc303.clase.proyecto;

// la T es para poder desde el main elegir el tipo de variable que vamos a utilizar 
// una variable tipo T puede ser cualquiera que escogamos
public class node<T> {


    private T value;
    private node<T> next;
private node<T> back;

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

    public void setNext(node<T> next) {
        this.next = next;
    }

    public node<T> getBack() {
        return back;
    }

    public void setBack(node<T> back) {
        this.back = back;
    }


    
}
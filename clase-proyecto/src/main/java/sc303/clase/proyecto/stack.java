
package sc303.clase.proyecto;

public class stack<T> {

    private node<T> top;
//void por que no va a devolver nada

    public void push(T value) {
        node<T> newNode = new node<T>(value);//le estamos pasando el valor al constructor del node

        if (top == null) {//hay que verificar que el top sea igual a nulo y si esta vacio 
            top = newNode;//esto es un push para asignarle el valor
        } else {
            newNode.setNext(top);//el nuevo elemento señala a el viejo y el setNext es el enlace 
            top = newNode;//se le asigna el nuevo valor
        }

    }

    public T pop() {//el pop es para sacar el ultimo elemento que llego a la pila
        node<T> aux = top;
        if (top != null) {// si es diferente de nulo es por que tiene valores
            top = top.getNext();//se esta usando como referencia el elemento que esta señalando el top para acceder al anterior por medio del getNext este ultimo siempre se usa para acceder a elementos anteriores del top de la pila top=top.getNext(); siempre se hace asi
            return aux.getValue();//nos va a devolver el valor que saca de la pila

        } else {
            return null;
        }

    }
}

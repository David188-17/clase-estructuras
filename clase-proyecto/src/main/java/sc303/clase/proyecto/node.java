
package sc303.clase.proyecto;


public class node {
    private int value;
private node next;



    public node() {
        this.value = 0;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }



}

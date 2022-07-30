 
package sc303.clase.proyecto;


public class node_arbol {
    private int id;
            private node_arbol hijoIzq;
            private node_arbol hijoder;

    public node_arbol(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public node_arbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(node_arbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public node_arbol getHijoder() {
        return hijoder;
    }

    public void setHijoder(node_arbol hijoder) {
        this.hijoder = hijoder;
    }

}

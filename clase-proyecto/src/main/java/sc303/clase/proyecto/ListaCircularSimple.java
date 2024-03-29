package sc303.clase.proyecto;

public class ListaCircularSimple {

    private node<persona> head;
    private node<persona> tail;

    public void insertar(persona value) {
        if (head == null) {

            head = new node<persona>(value);

            tail = head;

            tail.setNext(head);

        } else if (head.getValue().getId() > value.getId()) {
            node<persona> aux = new node<persona>(value);
            aux.setNext(head);
            head = aux;

        } else if (tail.getValue().getId() <= value.getId()) {
            node<persona> aux = new node<persona>(value);
            tail.setNext(aux);
            tail = aux;
            tail.setNext(head);
        } else {
            node<persona> aux = tail;
            while (aux.getNext() != null && aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();

            }
            node<persona> Temp = new node<persona>(value);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
        }
    }
  
    public void modificar(persona Persona) {
        node<persona> aux = head;

        if (head != null) {

            while (aux != null && aux.getValue().getId() < Persona.getId()) {
                aux = aux.getNext();

            }
            if (aux != null && aux.getValue().getId() == Persona.getId()) {
                aux.getValue().setNombre(Persona.getNombre());

            }

        }

    }

    public void imprimirlista() {
        node<persona> aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail);

    }

}


  
  
  
    

    
    
    
    
    
    
    
    


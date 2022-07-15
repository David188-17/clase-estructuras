
package sc303.clase.proyecto;


public class listadoblecircular {
  
    
     private node<persona> head;
    private node<persona> tail;

    public void insertar(persona value) {
        if (head == null) {

            head = new node<persona>(value);

            tail = head;
            tail.setNext(head);
            head.setNext(tail);
            tail.setBack(head);
            head.setBack(tail);

        } else if (head.getValue().getId() > value.getId()) {
            node<persona> aux = new node<persona>(value);
            aux.setNext(head);
            head = aux;

            tail.setNext(head);
           
          
            head.setBack(tail);

            
             } else if (value.getId() >= tail.getValue().getId()) {
            node<persona> aux = new node<persona>(value);
            aux.setBack(tail);
            tail.setNext(aux);
            tail = aux;
            tail.setNext(head);
            head.setBack(tail);
            

        } else {
            node<persona> aux =tail;
            
 
         
           while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();

            }
            node<persona> temp = new node<persona>(value);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            aux.getNext().setBack(temp);
            temp.setBack(aux);
            
        }
    }
    public void imprimirlista(){
        if (head== null)  {
            System.out.println("la lista esta vacia");
        
            
        } else {
            node<persona> aux =head;
            do {                
                System.out.println(aux.getValue().getId()+"," +aux.getValue().getNombre());
                aux = aux.getNext();
                
            } while (aux !=head);
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    









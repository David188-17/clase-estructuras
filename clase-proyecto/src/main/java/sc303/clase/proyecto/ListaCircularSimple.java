
package sc303.clase.proyecto;


public class ListaCircularSimple {
    
    
    private node<persona> head;
       private node<persona> tail;
    
  public void insertar(persona value){
        if ( head== null){
            
            head= new node<persona>(value);
            
            tail=head;
            
            tail.setNext(head);
            
        }
        else if (head.getValue().getId() >value.getId()){
            node<persona> aux = new node<persona>(value);
            aux.setNext(head);
            head= aux;
            
        }else if (tail.getValue().getId() <=value.getId()){
            node<persona> aux = new node<persona>(value);
            tail.setNext(aux);
            tail= aux;
            tail.setNext(head);
        }
        else{
            node<persona> aux = tail;
            while(aux.getNext()!=null && aux.getNext().getValue().getId()<value.getId()){
                aux= aux.getNext();
                
            }
            node<persona> Temp= new node<persona>(value);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
        }
    }
    
}
    
    
    
    
    
    
    
    


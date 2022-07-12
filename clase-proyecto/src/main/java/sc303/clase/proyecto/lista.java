
package sc303.clase.proyecto;


public class lista {
    private node<persona> cabeza;
    public void insertar (persona value){
        if (cabeza==null) {
            cabeza = new node<persona>(value);
        } 
        else if (cabeza.getValue().getId()>value.getId() ){
                node<persona> aux = new node<persona>(value);
        aux.setNext(cabeza);
        cabeza=aux;
        
        }
        else if (cabeza.getValue().getId()<value.getId() && cabeza.getNext()==null){
                node<persona> aux = new node<persona>(value);
        
        cabeza.setNext(aux);
        
    }
        
        else {
            node<persona> aux =cabeza;
            while (aux.getNext()!=null
                && aux.getNext().getValue().getId()<value.getId()){
            node<persona> temp = new node<persona>(value);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            
            
            }
        }
    }
        
                public void imprimirlista(){
                    
                    node<persona> aux =cabeza;
                    while(aux!=null){
                        System.out.println(aux.getValue().getId());
                        aux=aux.getNext();
                    }
                
                
                
             
                }
                
                
                
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.clase.proyecto;


public class queue <T>{
    
    private node<T> head;
private node<T> tail;

public void enqueue(T value){
    node<T> newNode = new node<T> (value);
    
    if(head==null){
    head=newNode;  
        tail=newNode;
        
        
        
    }
    else{
        tail.setNext(newNode);
        tail=newNode;
    }
}
public node<T> dequeue(){
      if(head==null){
          System.out.println("la cola ya se encuentra vacia");
    return null;
          
      }else{
            node<T> firstInQueue = head;//lugar para guardar el head
          head=head.getNext();//el head es el ultimo queremos el penultimo
          return firstInQueue;
      }
}
}


            

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sc303.clase.proyecto;

public class Main {

    public static void main(String[] args) {

        //int arr []= {12,34,64,2,3};        
//-----------------------Recursividad--------------------
        // System.out.println(recursion.factorial(3));
        //  System.out.println(recursion.encontrarMax(arr,0,0));
       // stack<Integer> Pila = new stack<Integer>();
       // Pila.push(1);
       // Pila.push(2);
       // Pila.push(3);
       // System.out.println(Pila.pop());
       // System.out.println(Pila.pop());
       // System.out.println(Pila.pop());
       // System.out.println(Pila.pop());

       
       //------------Colas-----------------
    
    queue<Integer> Cola = new queue<Integer>();
 Cola.enqueue(1);
Cola.enqueue(2);
Cola.enqueue(4);
System.out.println(Cola.dequeue());
System.out.println(Cola.dequeue().getValue());
}
}

package sc303.clase.proyecto;


public class arbol_binario {
    
   private node_arbol raiz;
   private int altura;
    public void inserta(int value){
        if (raiz==null) {
            raiz = new node_arbol(value);
        }  else {
                    insertar(raiz,value);
                    
                    }   
        }
        
            public void insertar(node_arbol node_arbol, int value){
                if (value<=node_arbol.getId()) {
                    if (node_arbol.getHijoIzq()==null) {
                        node_arbol.setHijoIzq(new node_arbol(value));
                    }else{
                        insertar(node_arbol.getHijoIzq(),value);
                    }
                    
                    }else{
                            if (node_arbol.getHijoder()==null) {
                        node_arbol.setHijoder(new node_arbol(value));
                    }else{
                        insertar(node_arbol.getHijoder(),value);
                  
                            }
                            }
                }
            
            public void inOrden(){
                if (raiz!= null) {
                    inOrdenRecorrer(raiz);
                    
                }else{
                    System.out.println("Arbol esta vacio");
                }
            }
                private void inOrdenRecorrer(node_arbol node_arbol){
                    if (node_arbol!=null) {
                        inOrdenRecorrer(node_arbol.getHijoIzq());
                        System.out.println(node_arbol.getId() + " , ");
                         inOrdenRecorrer(node_arbol.getHijoder());
                    }
  
                }
                
                public void retornarAltura(node_arbol  node_arbol, int nivel){
                
                        if (node_arbol != null) {
                        retornarAltura(node_arbol.getHijoIzq(), nivel+1);
                            if (nivel>altura) {
                                altura =nivel;
                            }
                                System.out.println("En este momento, gire a la derecha"+ node_arbol.getId());
                                retornarAltura(node_arbol.getHijoder(), nivel +1);
                                
                            }
                        }
                    
                public int retornarAltura(){
                    
                    altura =0;
                    retornarAltura(raiz, 1);
                    System.out.println(altura);
                    return altura;
                }
}
                
                
            
            
            
            
        
    
    
    


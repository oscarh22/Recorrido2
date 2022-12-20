package recorrido;


public class Arbol {
        private NodoArbol raiz;
    
   String verde = "\033[32m";
    public Arbol()
    {
        raiz = null;
    }
    
   
    public synchronized void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new NodoArbol(valorInsertar);
        else
            raiz.insertar(valorInsertar);    
    }
    
    
    public synchronized void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }
    
    
    private void ayudantePreorden(NodoArbol nodo)
    {
        if(nodo == null)
            return;
        
        System.out.print(verde +nodo.datos + " ");    
        ayudantePreorden(nodo.nodoizquierdo);  
        ayudantePreorden(nodo.nododerecho);     
    }
    
  
    public synchronized void recorridoInorden()
    {
        ayudanteInorden(raiz);
    }
    
    private void ayudanteInorden( NodoArbol nodo)
    {
        if(nodo == null)
            return;
        
        ayudanteInorden(nodo.nodoizquierdo);
        System.out.print(verde + nodo.datos + " ");
        ayudanteInorden(nodo.nododerecho);
    }
    
  
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(raiz);        
    }
    
    
    private void ayudantePosorden(NodoArbol nodo)
    {
        if( nodo == null )
            return;
        
        ayudantePosorden(nodo.nodoizquierdo);
        ayudantePosorden(nodo.nododerecho);
        System.out.print(verde + nodo.datos + " ");
    }
}

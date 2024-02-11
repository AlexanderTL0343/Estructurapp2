/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg109420343pp2;

/**
 *
 * @author User
 */
public class Cola {
    private Nodo frente;
    private Nodo ultimo;

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public void hacerFila(String nombre, int edad, String apellido, int cedula)
    {
        Dato auxDato = new Dato( nombre,  edad, apellido,  cedula);
        Nodo auxNodo = new Nodo(auxDato);
        
        if(frente == null) // La fila está vacía
        {
            frente = auxNodo;
            ultimo = auxNodo;
        }
        else
        {
           
            ultimo.setAtras(auxNodo);
            ultimo = auxNodo;  
        }
    }      
    
    public boolean esVacia(){
        if(frente == null && ultimo == null){
            return true;
        }else{
            return false;
        }
    }
    public int getTotal(Nodo aux){
        int total=0;
        Dato auxDato= aux.getDato();
        if(aux.getAtras()!=null){
            total= total + auxDato.getEdad()+getTotal(aux.getAtras());
        }
         else{
            total= total + auxDato.getEdad();
               
       }
        return total;
    }
    public int getGente(Nodo aux){
        int total;
        if(aux.getAtras()!=null){
            total= 1+getGente(aux.getAtras());
        }
         else{
            total=1;
               
       }
        
        return total;
     }
    public int  getpromedioEdadPersonas(){
        int total=0;
        if(!esVacia()){
            total=getTotal(frente)/getGente(frente);
        }
        return total;
    }
    
}

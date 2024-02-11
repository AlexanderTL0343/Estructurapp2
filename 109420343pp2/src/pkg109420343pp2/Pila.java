/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg109420343pp2;

/**
 *
 * @author User
 */
public class Pila {
    private  NodoParaPila cima;

    public Pila() {
        this.cima = null;
    }
    
    public boolean esVacia()
    {
        if(cima == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String imprimirPila()
    {
        String respuesta = ""; // En este string vamos a ir almacenando cada uno de los nodos de la pila
        
        if(!esVacia()) //Si la lista no es vacía la imprimimos
        {
            NodoParaPila aux = cima; //Por cada nodo en el que me mueva, voy a guardar la referencia
            while(aux != null) //Siempre y cuando el auxiliar no sea nulo
            {
                //Voy a seguir recorriendo la pila
                respuesta += aux.getElemento().getCedula() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return respuesta;
    }
    public void orden(NodoParaPila ordenPresente , NodoParaPila ordenar)
    {
        if(ordenPresente.getSiguiente()==null){
            ordenPresente.setSiguiente(ordenar);
        }else{
           if(ordenar.getElemento().getCedula()>=ordenPresente.getSiguiente().getElemento().getCedula()&& ordenar.getElemento().getCedula()<ordenPresente.getElemento().getCedula()){
               ordenar.setSiguiente(ordenPresente.getSiguiente());
               ordenPresente.setSiguiente(ordenar);
           }else{
               orden(ordenPresente.getSiguiente(),ordenar);
           }
        }
    }public void apilar(String nombre, int edad, String apellido, int cedula)
    {
        //Insertar elementos en la pila
        if(esVacia()){
            apilar(nombre, edad, apellido, cedula);
        }else{
            DatoParaPila auxDataParaPila = new DatoParaPila( nombre, edad, apellido, cedula);
            DatoParaPila auxCima = cima.getElemento();
            NodoParaPila ordenar=new NodoParaPila(nombre, edad, apellido, cedula);
            if(auxDataParaPila.getCedula()>=auxCima.getCedula()){
                apilar( nombre, edad, apellido, cedula);
            }else{
                orden(cima,ordenar);
            }
        }
    
}
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg109420343pp2;

/**
 *
 * @author User
 */
public class PracticaProgramada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila nuevaPila = new Pila();
        Cola cola1 = new Cola();
         
        cola1.hacerFila("Juan", 30, "perez", 170408356);
        cola1.hacerFila("Albert", 20, "Gutierez", 217542365);
        cola1.hacerFila("Julio", 14, "Torres", 183729423);
        cola1.hacerFila("Antonio", 19, "Lopez", 345262627);
        cola1.hacerFila("Naomi", 89, "Quesada", 194537553);
        cola1.hacerFila("Maria", 40, "Cespedes", 293460274);
        cola1.hacerFila("Pedro", 35, "Rivera", 173420864);
        cola1.hacerFila("Rosa", 12, "Fernadez", 163496982);
        cola1.hacerFila("Dexter", 56, "Gago", 864538204);
        cola1.hacerFila("David", 78, "Bisbal", 283704563);
        
        System.out.println("El promedio de las edades es de:"+cola1.getpromedioEdadPersonas());
        
        nuevaPila.apilar("Juan", 30, "perez", 1704083560);
        nuevaPila.apilar("Albert", 20, "Gutierez", 217542365);
        nuevaPila.apilar("Julio", 14, "Torres", 183729423);
        nuevaPila.apilar("Antonio", 19, "Lopez", 345262627);
        nuevaPila.apilar("Naomi", 89, "Quesada", 194537553);
        nuevaPila.apilar("Maria", 40, "Cespedes", 293460274);
        nuevaPila.apilar("Pedro", 35, "Rivera", 173420864);
        nuevaPila.apilar("Rosa", 12, "Fernadez", 163496982);
        nuevaPila.apilar("Dexter", 56, "Gago", 864538204);
        nuevaPila.apilar("David", 78, "Bisbal", 28370456);
        
        System.out.println(nuevaPila.imprimirPila());

        
         
        
        
    }
    
}

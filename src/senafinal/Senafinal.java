package senafinal;

import java.util.Scanner;

public class Senafinal {

   
    public static void main(String[] args) {
        
        String nom,apellido;
            
      Scanner nombre = new Scanner (System.in);
        System.out.println("Ingrese su pagina favorita");
        nom=nombre.next(); 
        
         System.out.println("Ingrese su apellido");
        apellido=nombre.next(); 
        
        
        String esta;
      Scanner estado = new Scanner (System.in);
        System.out.println("Ingrese su estado amoroso");
        esta=estado.next();
        
        
        
                
        System.out.println("Su pagina favorita es: " + nom);
        System.out.println("Su estado amoroso es: " + esta);
    }
    
}

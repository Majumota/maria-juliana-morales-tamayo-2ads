// María Juliana Morales Tamayo
// Parcial 2 - Patrones de diseño State y Adapter

package maria.juliana.morales.tamayo.parcial.pkg2.ads;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAlarmas {

        public static void main(String[] args) {
        
        //Creamos los objetos
        Alarma alarma = new Alarma();
        Activa activa = new Activa();
        Mantenimiento mantenimiento = new Mantenimiento();
        
        //Entrada de datos
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        
        //Guardaremos la opcion indicada del usuario
        int opciones; 
        
        while (!exit) {
            
            //Opciones disponibles que pueden ser consultadas por el usuario
            System.out.println("Indique el estado de la alarma");
            System.out.println("1. Activar Principal");
            System.out.println("2. Desactivar Principal");
            System.out.println("3. Activar Garaje");
            System.out.println("4. Desactivar Garaje");
            System.out.println("5. Mantenimiento");
            System.out.println("0. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
               
                //Lectura de datos 
                opciones = sn.nextInt();
                
                //Toma de decisiones segun la opcion introducida por el usuario
                switch(opciones){
                case 1:
                    alarma.setEstado(activa);
                    alarma.ejecutarAccion();
                    miAlarma aPrincipal = new AlarmaPrincipal();
                    aPrincipal.encenderAlarma();
                    break;
                case 2:
                    alarma.setEstado(activa);
                    alarma.ejecutarAccion();
                    miAlarma aPrincipal1 = new AlarmaPrincipal();
                    aPrincipal1.apagarAlarma();             
                    break;
                case 3:
                    alarma.setEstado(activa);
                    alarma.ejecutarAccion();
                    miAlarma aCasaAlarma = new Adapter();
                    aCasaAlarma.encenderAlarma();
                    break;
                case 4:
                    alarma.setEstado(activa);
                    alarma.ejecutarAccion();
                    miAlarma aCasaAlarma1 = new Adapter();
                    aCasaAlarma1.apagarAlarma();            
                    break;
                case 5:
                    alarma.setEstado(mantenimiento);
                    alarma.ejecutarAccion();
                    break;
                case 0: 
                    System.exit(0);
                default:
                    System.out.println("Accion incorrecta"); 
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar la opcion correcta");
                sn.next();
            }
        }
 
    }
}

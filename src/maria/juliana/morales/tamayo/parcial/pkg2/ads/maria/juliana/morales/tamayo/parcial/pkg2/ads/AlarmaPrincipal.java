// Mar�a Juliana Morales Tamayo
// Parcial 2 - Patrones de dise�o State y Adapter

package maria.juliana.morales.tamayo.parcial.pkg2.ads;

public class AlarmaPrincipal extends miAlarma{
    
    public void encenderAlarma(){
        System.out.println("La alarma principal ha sido activada");
    }

    public void apagarAlarma(){
        System.out.println("La alarma principal ha sido desactivada");
    } 
}
// María Juliana Morales Tamayo
// Parcial 2 - Patrones de diseño State y Adapter

package maria.juliana.morales.tamayo.parcial.pkg2.ads;

public class AlarmaPrincipal extends miAlarma{
    
    public void encenderAlarma(){
        System.out.println("La alarma principal ha sido activada");
    }

    public void apagarAlarma(){
        System.out.println("La alarma principal ha sido desactivada");
    } 
}
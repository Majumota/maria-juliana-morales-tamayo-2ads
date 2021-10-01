// María Juliana Morales Tamayo
// Parcial 2 - Patrones de diseño State y Adapter

package maria.juliana.morales.tamayo.parcial.pkg2.ads;

/**Se define el estado de la alarma, en donde el usuario indica que este esta¡ 
 * en mantenimiento por lo que se indica que debe enviarse un mensaje para 
 * informar el estado **/

public class Mantenimiento implements Estado{
    @Override
    public void ejecutarAccion(){
        System.out.println("La alarma esta desactivada, requiere mantenimiento");
        System.out.println("Se enviara un mensaje para informar estado");
    }

    @Override
    public void establecerAlarma() {
    }
}

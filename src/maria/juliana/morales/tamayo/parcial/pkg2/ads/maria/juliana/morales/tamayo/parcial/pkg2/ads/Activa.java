// Mar�a Juliana Morales Tamayo
// Parcial 2 - Patrones de dise�o State y Adapter

package maria.juliana.morales.tamayo.parcial.pkg2.ads;

/**Se define el estado de la alarma, en donde el usuario indica que esta está 
 *  activa por lo que se indica que debe enviarse un mensaje para informar el 
 * estado **/

public class Activa implements Estado{
    @Override
    public void ejecutarAccion(){
        System.out.println("La alarma esta activa y funcionando correctamente");
    }

    @Override
    public void establecerAlarma() {
    }
}

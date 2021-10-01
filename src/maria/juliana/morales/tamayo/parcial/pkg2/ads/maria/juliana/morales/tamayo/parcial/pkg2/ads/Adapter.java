// María Juliana Morales Tamayo
// Parcial 2 - Patrones de diseño State y Adapter

package maria.juliana.morales.tamayo.parcial.pkg2.ads;

public class Adapter extends miAlarma{
    AlarmaGaraje garaje = new AlarmaGaraje();
    
    public void encenderAlarma(){
    garaje.activarAlarma();
    }

    public void apagarAlarma(){
    garaje.desactivarAlarma();
    }
}

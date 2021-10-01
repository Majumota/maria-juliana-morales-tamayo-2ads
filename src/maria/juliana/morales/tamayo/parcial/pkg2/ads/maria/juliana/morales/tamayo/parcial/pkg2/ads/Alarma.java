// Mar�a Juliana Morales Tamayo
// Parcial 2 - Patrones de dise�o State y Adapter

package maria.juliana.morales.tamayo.parcial.pkg2.ads;

/**Se asigna el estado de la alarma**/

public class Alarma{
    private Estado miEstado;
    
    public void setEstado (Estado e){
        this.miEstado = e;
    }

    public void ejecutarAccion(){
        miEstado.ejecutarAccion();
    }

    public void encenderAlarma() {
    }

    public void setAdapter(AlarmaGaraje alarmaGaraje) {
    }

    public void setAdapter(AlarmaPrincipal alarmaPrincipal) {
    }
}


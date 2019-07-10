import Vehiculo.Vehiculo;
import principal.Asignacion;
import principal.Tecnico;

@SuppressWarnings("all")
public class Taller {
  private Asignacion asignacion = new Asignacion();
  
  public boolean agregarVehiculo(final Vehiculo nuevoVehiculo) {
    return this.asignacion.asignacionAutomatica(nuevoVehiculo);
  }
  
  public boolean agregarVehiculoManual(final Vehiculo nuevoVehiculo, final Tecnico tecnico) {
    return this.asignacion.asignarTecnico(nuevoVehiculo, tecnico);
  }
}

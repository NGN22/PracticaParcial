package principal;

import Vehiculo.Vehiculo;
import com.google.common.base.Objects;
import principal.CondicionSimple;

@SuppressWarnings("all")
public class CondicionNombre extends CondicionSimple {
  private final String aceptado;
  
  public CondicionNombre(final String NuevaCondicion) {
    this.aceptado = NuevaCondicion;
  }
  
  @Override
  public boolean aceptaTrabajarCon(final Vehiculo nuevoVehiculo) {
    String _nombreCliente = nuevoVehiculo.getNombreCliente();
    return (!Objects.equal(_nombreCliente, this.aceptado));
  }
}

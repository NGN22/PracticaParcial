package principal;

import Vehiculo.MarcaModelo;
import Vehiculo.Vehiculo;
import com.google.common.base.Objects;
import principal.CondicionSimple;

@SuppressWarnings("all")
public class CondicionMarca extends CondicionSimple {
  private final MarcaModelo aceptado;
  
  public CondicionMarca(final MarcaModelo NuevaCondicion) {
    this.aceptado = NuevaCondicion;
  }
  
  @Override
  public boolean aceptaTrabajarCon(final Vehiculo nuevoVehiculo) {
    MarcaModelo _marcaYmodelo = nuevoVehiculo.getMarcaYmodelo();
    return Objects.equal(_marcaYmodelo, this.aceptado);
  }
}

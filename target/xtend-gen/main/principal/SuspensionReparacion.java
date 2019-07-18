package principal;

import Vehiculo.Vehiculo;
import principal.Mejora;

@SuppressWarnings("all")
public class SuspensionReparacion extends Mejora {
  private String suspensionInvolucrada = " ";
  
  public SuspensionReparacion(final String suspensionNueva, final Vehiculo auto) {
    this.setVehiculo(auto);
    this.suspensionInvolucrada = suspensionNueva;
  }
  
  @Override
  public void ejecutar() {
    this.getVehiculo().repararSuspension(this.suspensionInvolucrada);
  }
  
  @Override
  public double calcularCosto() {
    double _calcularCosto = super.calcularCosto();
    return (_calcularCosto * 2);
  }
}

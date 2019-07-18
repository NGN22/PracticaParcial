package principal;

import Vehiculo.Vehiculo;
import principal.Mejora;

@SuppressWarnings("all")
public class RotacionCubiertas extends Mejora {
  public RotacionCubiertas(final Vehiculo auto) {
    this.setVehiculo(auto);
  }
  
  @Override
  public void ejecutar() {
    this.getVehiculo().rotarCubiertas();
  }
  
  @Override
  public double calcularCosto() {
    double _calcularCosto = super.calcularCosto();
    return (_calcularCosto + 200);
  }
}

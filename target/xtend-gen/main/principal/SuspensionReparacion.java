package principal;

import Vehiculo.Suspension;
import principal.Mejora;

@SuppressWarnings("all")
public class SuspensionReparacion extends Mejora {
  private Suspension suspensionInvolucrada;
  
  @Override
  public void ejecutar() {
    this.suspensionInvolucrada.reparar();
  }
  
  @Override
  public float calcularCosto() {
    float _costoBaseSuspension = this.getVehiculo().getMarcaYmodelo().getCostoBaseSuspension();
    return (_costoBaseSuspension * 2);
  }
}

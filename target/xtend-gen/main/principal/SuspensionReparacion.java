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
    float _calcularCosto = super.calcularCosto();
    float _costoBaseSuspension = this.getVehiculo().getMarcaYmodelo().getCostoBaseSuspension();
    float _multiply = (_costoBaseSuspension * 2);
    return (_calcularCosto + _multiply);
  }
}

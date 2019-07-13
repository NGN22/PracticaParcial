package principal;

import principal.Mejora;

@SuppressWarnings("all")
public class RotacionCubiertas extends Mejora {
  @Override
  public void ejecutar() {
    this.getVehiculo().rotarCubiertas();
  }
  
  @Override
  public float calcularCosto() {
    float _calcularCosto = super.calcularCosto();
    return (_calcularCosto + 200);
  }
}

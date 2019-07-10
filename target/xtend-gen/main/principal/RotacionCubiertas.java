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
    return 200;
  }
}

package principal;

import Vehiculo.Vehiculo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Mejora {
  private Vehiculo vehiculo;
  
  public void ejecutar() {
  }
  
  public double calcularCosto() {
    return this.vehiculo.costoBase();
  }
  
  @Pure
  public Vehiculo getVehiculo() {
    return this.vehiculo;
  }
  
  public void setVehiculo(final Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }
}

package principal;

import Vehiculo.Vehiculo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public abstract class Mejora {
  private Vehiculo vehiculo;
  
  public abstract void ejecutar();
  
  public float calcularCosto() {
    return 0;
  }
  
  @Pure
  public Vehiculo getVehiculo() {
    return this.vehiculo;
  }
  
  public void setVehiculo(final Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }
}

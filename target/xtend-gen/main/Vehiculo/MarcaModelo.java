package Vehiculo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class MarcaModelo {
  private double costo;
  
  @Pure
  public double getCosto() {
    return this.costo;
  }
  
  public void setCosto(final double costo) {
    this.costo = costo;
  }
}

package Vehiculo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class MarcaModelo {
  private float costo;
  
  private float costoBaseSuspension;
  
  public float costo() {
    return this.costo;
  }
  
  @Pure
  public float getCosto() {
    return this.costo;
  }
  
  public void setCosto(final float costo) {
    this.costo = costo;
  }
  
  @Pure
  public float getCostoBaseSuspension() {
    return this.costoBaseSuspension;
  }
  
  public void setCostoBaseSuspension(final float costoBaseSuspension) {
    this.costoBaseSuspension = costoBaseSuspension;
  }
}

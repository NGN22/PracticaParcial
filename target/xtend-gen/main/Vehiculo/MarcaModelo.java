package Vehiculo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class MarcaModelo {
  private float costoBaseCubierta;
  
  private float costoBaseSuspension;
  
  @Pure
  public float getCostoBaseCubierta() {
    return this.costoBaseCubierta;
  }
  
  public void setCostoBaseCubierta(final float costoBaseCubierta) {
    this.costoBaseCubierta = costoBaseCubierta;
  }
  
  @Pure
  public float getCostoBaseSuspension() {
    return this.costoBaseSuspension;
  }
  
  public void setCostoBaseSuspension(final float costoBaseSuspension) {
    this.costoBaseSuspension = costoBaseSuspension;
  }
}

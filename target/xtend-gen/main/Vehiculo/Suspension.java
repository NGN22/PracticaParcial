package Vehiculo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Suspension {
  private float medida;
  
  public float reparar() {
    return this.medida = 0;
  }
  
  @Pure
  public float getMedida() {
    return this.medida;
  }
  
  public void setMedida(final float medida) {
    this.medida = medida;
  }
}

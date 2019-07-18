package Vehiculo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Suspension {
  private float desgaste;
  
  public Suspension(final float nuevo) {
    this.desgaste = nuevo;
  }
  
  public float reparar() {
    return this.desgaste = 0;
  }
  
  @Pure
  public float getDesgaste() {
    return this.desgaste;
  }
  
  public void setDesgaste(final float desgaste) {
    this.desgaste = desgaste;
  }
}

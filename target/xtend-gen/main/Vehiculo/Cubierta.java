package Vehiculo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Cubierta {
  private int desgaste;
  
  public int reparar() {
    return this.desgaste;
  }
  
  @Pure
  public int getDesgaste() {
    return this.desgaste;
  }
  
  public void setDesgaste(final int desgaste) {
    this.desgaste = desgaste;
  }
}

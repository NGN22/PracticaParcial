package Vehiculo;

import Vehiculo.Dibujo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Cubierta {
  private Dibujo dibujo;
  
  public Object reparar() {
    return null;
  }
  
  @Pure
  public Dibujo getDibujo() {
    return this.dibujo;
  }
  
  public void setDibujo(final Dibujo dibujo) {
    this.dibujo = dibujo;
  }
}

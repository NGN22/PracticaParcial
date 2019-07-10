package dos;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Suspension {
  private float delantera;
  
  private float trasera;
  
  @Pure
  public float getDelantera() {
    return this.delantera;
  }
  
  public void setDelantera(final float delantera) {
    this.delantera = delantera;
  }
  
  @Pure
  public float getTrasera() {
    return this.trasera;
  }
  
  public void setTrasera(final float trasera) {
    this.trasera = trasera;
  }
}

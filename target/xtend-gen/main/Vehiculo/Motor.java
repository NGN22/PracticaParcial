package Vehiculo;

import Vehiculo.ControladorVerdadero;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Motor {
  private ControladorVerdadero controladorVerdadero;
  
  public boolean estado() {
    return this.controladorVerdadero.comoEstaElMotor();
  }
  
  public Object reguladorBujias() {
    return null;
  }
  
  @Pure
  public ControladorVerdadero getControladorVerdadero() {
    return this.controladorVerdadero;
  }
  
  public void setControladorVerdadero(final ControladorVerdadero controladorVerdadero) {
    this.controladorVerdadero = controladorVerdadero;
  }
}

package Vehiculo;

import Vehiculo.ControladorVerdadero;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Motor {
  private ControladorVerdadero controladorVerdadero = new ControladorVerdadero();
  
  private boolean estado;
  
  public Motor() {
    this.estado = this.getStatus();
  }
  
  public void arreglarMotor() {
    this.ajustarRpm();
    this.regularBujias();
  }
  
  public boolean getStatus() {
    return this.controladorVerdadero.comoEstaElMotor();
  }
  
  public void ajustarRpm() {
    this.controladorVerdadero.ajustarRpm();
  }
  
  public void regularBujias() {
    this.controladorVerdadero.regularBujias();
  }
  
  @Pure
  public ControladorVerdadero getControladorVerdadero() {
    return this.controladorVerdadero;
  }
  
  public void setControladorVerdadero(final ControladorVerdadero controladorVerdadero) {
    this.controladorVerdadero = controladorVerdadero;
  }
  
  @Pure
  public boolean isEstado() {
    return this.estado;
  }
  
  public void setEstado(final boolean estado) {
    this.estado = estado;
  }
}

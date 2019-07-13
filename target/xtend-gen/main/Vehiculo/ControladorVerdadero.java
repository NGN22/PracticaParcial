package Vehiculo;

import Vehiculo.Controlador;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ControladorVerdadero implements Controlador {
  public Object regularBujias() {
    return this.arreglarBujias();
  }
  
  public Object arreglarBujias() {
    return null;
  }
  
  public boolean comoEstaElMotor() {
    return this.comprobacion();
  }
  
  public boolean comprobacion() {
    int _status = this.status();
    return (_status == 0);
  }
  
  public void ajustarRpm() {
    int _rpm = this.getRpm();
    boolean _notEquals = (_rpm != 200);
    if (_notEquals) {
      this.verificarMotor(1);
    }
  }
  
  public void verificarMotor(final int variable) {
    final Procedure1<Integer> _function = (Integer numero) -> {
      this.setRpm(numero);
    };
    final Procedure1<Integer> bloque = _function;
  }
  
  public int disminuir() {
    return (-1);
  }
  
  public int aumentar() {
    return 1;
  }
}

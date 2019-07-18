package principal;

import Vehiculo.Vehiculo;
import principal.Mejora;

@SuppressWarnings("all")
public class RegulacionMotor extends Mejora {
  private int tiempo;
  
  private boolean desmonte;
  
  public RegulacionMotor(final int demora, final boolean validacionDesmonte, final Vehiculo auto) {
    this.tiempo = demora;
    this.desmonte = validacionDesmonte;
    this.setVehiculo(auto);
  }
  
  @Override
  public void ejecutar() {
    this.getVehiculo().regulacionMotor();
  }
  
  @Override
  public double calcularCosto() {
    double _calcularCosto = super.calcularCosto();
    int _sumarAdicionales = this.sumarAdicionales();
    return (_calcularCosto + _sumarAdicionales);
  }
  
  public int sumarAdicionales() {
    int _adicionalDesmonte = this.adicionalDesmonte();
    int _adicionalTiempo = this.adicionalTiempo();
    return (_adicionalDesmonte + _adicionalTiempo);
  }
  
  public int adicionalTiempo() {
    int _xifexpression = (int) 0;
    if (this.desmonte) {
      _xifexpression = 1000;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  public int adicionalDesmonte() {
    int _xifexpression = (int) 0;
    if ((this.tiempo > 20)) {
      _xifexpression = 1500;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
}

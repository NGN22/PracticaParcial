package parcial;

import Vehiculo.ControladorVerdadero;

@SuppressWarnings("all")
public class controladorMock extends ControladorVerdadero {
  private int rpm = 800;
  
  @Override
  public void setRpm(final int i) {
    this.rpm = (this.rpm + i);
  }
  
  @Override
  public int getRpm() {
    return this.rpm;
  }
  
  @Override
  public void fixSparkPlug(final int i) {
  }
  
  @Override
  public int getSparkPlugsLength() {
    return 0;
  }
  
  @Override
  public int status() {
    return 0;
  }
}

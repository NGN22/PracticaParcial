package Vehiculo;

@SuppressWarnings("all")
public interface Controlador {
  public default int getRpm() {
    return this.getRpm();
  }
  
  public default void setRpm(final int i) {
  }
  
  public default void fixSparkPlug(final int i) {
  }
  
  public default int getSparkPlugsLength() {
    return 0;
  }
  
  public default int status() {
    return 0;
  }
}

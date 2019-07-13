package Vehiculo;

@SuppressWarnings("all")
public interface Controlador {
  public default int getRpm() {
    return 0;
  }
  
  public default void setRpm(final int i) {
  }
  
  public default void fixSparkPlug(final int i) {
  }
  
  public default int getSparkPlug() {
    return 0;
  }
  
  public default int status() {
    return 0;
  }
}

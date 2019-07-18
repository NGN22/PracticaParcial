package Vehiculo;

import Vehiculo.Controlador;
import java.util.Collections;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class ControladorVerdadero implements Controlador {
  public void regularBujias() {
    int _sparkPlugsLength = this.getSparkPlugsLength();
    IntegerRange _upTo = new IntegerRange(1, _sparkPlugsLength);
    final Consumer<IntegerRange> _function = (IntegerRange iterado) -> {
      this.fixSparkPlug(iterado.getStep());
    };
    Collections.<IntegerRange>unmodifiableList(CollectionLiterals.<IntegerRange>newArrayList(_upTo)).forEach(_function);
  }
  
  public boolean comoEstaElMotor() {
    return this.comprobacion();
  }
  
  public boolean comprobacion() {
    int _status = this.status();
    return (_status == 0);
  }
  
  public void ajustarRpm() {
    boolean _estadoRpm = this.estadoRpm();
    boolean _not = (!_estadoRpm);
    if (_not) {
      this.verRpm();
    }
  }
  
  public boolean estadoRpm() {
    int _rpm = this.getRpm();
    return (_rpm == 1000);
  }
  
  public void verRpm() {
    boolean _estadoRpm = this.estadoRpm();
    boolean _not = (!_estadoRpm);
    if (_not) {
      this.verificarMotor();
    }
  }
  
  public void verificarMotor() {
    boolean _condicionMotor = this.condicionMotor();
    if (_condicionMotor) {
      this.disminuir();
    } else {
      this.aumentar();
    }
  }
  
  public boolean condicionMotor() {
    int _rpm = this.getRpm();
    return (_rpm > 1000);
  }
  
  public void disminuir() {
    this.mandarRpm((-1));
    this.verRpm();
  }
  
  public void aumentar() {
    this.mandarRpm(1);
    this.verRpm();
  }
  
  public void mandarRpm(final int numero) {
    this.setRpm((numero * 10));
  }
}

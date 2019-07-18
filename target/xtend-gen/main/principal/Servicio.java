package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import principal.Mejora;
import principal.Tecnico;

@Accessors
@SuppressWarnings("all")
public class Servicio {
  private List<Mejora> mejoras = new ArrayList<Mejora>();
  
  private Tecnico tecnicoAsignado = new Tecnico();
  
  private LocalDate fechaDeHoy = LocalDate.now();
  
  public Servicio(final Tecnico tecnico, final List<Mejora> mejoraspendientes) {
    this.tecnicoAsignado = tecnico;
    this.mejoras = mejoraspendientes;
  }
  
  public Servicio() {
  }
  
  public void ejecutar() {
    final Consumer<Mejora> _function = (Mejora mejora) -> {
      mejora.ejecutar();
    };
    this.mejoras.forEach(_function);
  }
  
  public double calcularCosto() {
    final Function2<Double, Mejora, Double> _function = (Double acumulador, Mejora mejora) -> {
      double _calcularCosto = mejora.calcularCosto();
      return Double.valueOf(((acumulador).doubleValue() + _calcularCosto));
    };
    return (double) IterableExtensions.<Mejora, Double>fold(this.mejoras, Double.valueOf(0.0), _function);
  }
  
  @Pure
  public List<Mejora> getMejoras() {
    return this.mejoras;
  }
  
  public void setMejoras(final List<Mejora> mejoras) {
    this.mejoras = mejoras;
  }
  
  @Pure
  public Tecnico getTecnicoAsignado() {
    return this.tecnicoAsignado;
  }
  
  public void setTecnicoAsignado(final Tecnico tecnicoAsignado) {
    this.tecnicoAsignado = tecnicoAsignado;
  }
  
  @Pure
  public LocalDate getFechaDeHoy() {
    return this.fechaDeHoy;
  }
  
  public void setFechaDeHoy(final LocalDate fechaDeHoy) {
    this.fechaDeHoy = fechaDeHoy;
  }
}

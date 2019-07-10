package principal;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import principal.Mejora;
import principal.Tecnico;

@SuppressWarnings("all")
public class Servicio {
  private List<Mejora> mejoras;
  
  private Tecnico tecnicoAsignado;
  
  private LocalDate fechaDeHoy;
  
  public Servicio(final Tecnico tecnico, final List<Mejora> mejoraspendientes) {
    this.tecnicoAsignado = tecnico;
    this.mejoras = mejoraspendientes;
    this.fechaDeHoy = LocalDate.now();
  }
  
  public void ejecutar() {
    final Consumer<Mejora> _function = (Mejora mejora) -> {
      mejora.ejecutar();
    };
    this.mejoras.forEach(_function);
  }
  
  public double calcularCosto() {
    final Function2<Double, Mejora, Double> _function = (Double acumulador, Mejora mejora) -> {
      float _calcularCosto = mejora.calcularCosto();
      return Double.valueOf((_calcularCosto + (acumulador).doubleValue()));
    };
    return (double) IterableExtensions.<Mejora, Double>fold(this.mejoras, Double.valueOf(0.0), _function);
  }
}

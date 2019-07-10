package principal;

import Vehiculo.Cubierta;
import java.util.List;
import java.util.function.Consumer;
import principal.Mejora;

@SuppressWarnings("all")
public class ReparacionCubiertas extends Mejora {
  private List<Cubierta> cubiertas;
  
  @Override
  public void ejecutar() {
    final Consumer<Cubierta> _function = (Cubierta cubierta) -> {
      cubierta.reparar();
    };
    this.cubiertas.forEach(_function);
  }
  
  @Override
  public float calcularCosto() {
    int _size = this.cubiertas.size();
    return (_size * 200);
  }
}

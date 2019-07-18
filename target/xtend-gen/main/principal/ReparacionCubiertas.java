package principal;

import Vehiculo.Vehiculo;
import java.util.List;
import java.util.function.Consumer;
import principal.Mejora;

@SuppressWarnings("all")
public class ReparacionCubiertas extends Mejora {
  private List<String> cubiertasAReparar;
  
  public ReparacionCubiertas(final List<String> listaCubiertasMejorar, final Vehiculo auto) {
    this.setVehiculo(auto);
    this.cubiertasAReparar = listaCubiertasMejorar;
  }
  
  @Override
  public void ejecutar() {
    final Consumer<String> _function = (String elemento) -> {
      this.reparar(elemento);
    };
    this.cubiertasAReparar.forEach(_function);
  }
  
  public Object reparar(final String key) {
    return this.getVehiculo().repararCubierta(key);
  }
  
  @Override
  public double calcularCosto() {
    double _calcularCosto = super.calcularCosto();
    int _size = this.cubiertasAReparar.size();
    int _multiply = (_size * 200);
    return (_calcularCosto + _multiply);
  }
}

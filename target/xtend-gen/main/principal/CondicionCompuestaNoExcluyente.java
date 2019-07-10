package principal;

import Vehiculo.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import principal.CondicionSimple;

@SuppressWarnings("all")
public class CondicionCompuestaNoExcluyente extends CondicionSimple {
  private List<CondicionSimple> condiciones = new ArrayList<CondicionSimple>();
  
  @Override
  public boolean laCondicionEsAceptada(final Vehiculo nuevoVehiculo) {
    final Function1<CondicionSimple, Boolean> _function = (CondicionSimple condicion) -> {
      return Boolean.valueOf(condicion.laCondicionEsAceptada(nuevoVehiculo));
    };
    return IterableExtensions.<CondicionSimple>exists(this.condiciones, _function);
  }
}

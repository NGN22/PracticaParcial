package principal;

import Vehiculo.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import principal.CondicionSimple;

@SuppressWarnings("all")
public class Tecnico {
  private List<Vehiculo> vehiculosAsignados = new ArrayList<Vehiculo>();
  
  private List<CondicionSimple> condiciones = new ArrayList<CondicionSimple>();
  
  public boolean acepta(final Vehiculo vehiculo) {
    final Function1<CondicionSimple, Boolean> _function = (CondicionSimple condicion) -> {
      return Boolean.valueOf(condicion.aceptaTrabajarCon(vehiculo));
    };
    return IterableExtensions.<CondicionSimple>forall(this.condiciones, _function);
  }
  
  public boolean asignar(final Vehiculo vehiculo) {
    return this.vehiculosAsignados.add(vehiculo);
  }
}

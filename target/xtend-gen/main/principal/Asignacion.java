package principal;

import Vehiculo.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import principal.Tecnico;
import principal.myException;

@SuppressWarnings("all")
public class Asignacion {
  private List<Tecnico> tecnicos = new ArrayList<Tecnico>();
  
  public boolean asignacionAutomatica(final Vehiculo vehiculo) {
    try {
      boolean _xblockexpression = false;
      {
        boolean _hayTecnicos = this.hayTecnicos(vehiculo);
        boolean _not = (!_hayTecnicos);
        if (_not) {
          throw new myException("Se requiere asignacion manual ");
        }
        _xblockexpression = this.asignarTecnico(vehiculo, this.primerTecnico(vehiculo));
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Tecnico primerTecnico(final Vehiculo vehiculo) {
    return IterableExtensions.<Tecnico>head(this.listaTecnicos(vehiculo));
  }
  
  public boolean hayTecnicos(final Vehiculo vehiculo) {
    int _size = this.listaTecnicos(vehiculo).size();
    return (_size != 0);
  }
  
  public List<Tecnico> listaTecnicos(final Vehiculo vehiculo) {
    final Function1<Tecnico, Boolean> _function = (Tecnico tecnico) -> {
      return Boolean.valueOf(tecnico.acepta(vehiculo));
    };
    return IterableExtensions.<Tecnico>toList(IterableExtensions.<Tecnico>filter(this.tecnicos, _function));
  }
  
  public boolean asignarTecnico(final Vehiculo vehiculo, final Tecnico tecnico) {
    return tecnico.asignar(vehiculo);
  }
}

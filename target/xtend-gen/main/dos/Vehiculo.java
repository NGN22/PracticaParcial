package dos;

import dos.Cliente;
import dos.Cubierta;
import dos.EstadoMotor;
import dos.MarcaModelo;
import dos.Suspension;

@SuppressWarnings("all")
public class Vehiculo {
  private final String patente;
  
  private Cliente cliente;
  
  private float kilometraje;
  
  private MarcaModelo marcaYmodelo;
  
  private EstadoMotor estado;
  
  private Suspension suspension;
  
  private Cubierta cubiertas;
  
  public Vehiculo(final String patenteNueva, final Cliente clienteNuevo, final float kilometrajeInicial, final MarcaModelo marcaModeloNuevo, final EstadoMotor estado, final Suspension suspensionNueva, final Cubierta cubiertasNuevas) {
    this.patente = patenteNueva;
    this.cliente = clienteNuevo;
    this.kilometraje = kilometrajeInicial;
    this.marcaYmodelo = marcaModeloNuevo;
    this.suspension = suspensionNueva;
    this.cubiertas = cubiertasNuevas;
  }
}

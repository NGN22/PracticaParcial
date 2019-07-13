package Vehiculo;

import Vehiculo.Cliente;
import Vehiculo.Cubierta;
import Vehiculo.MarcaModelo;
import Vehiculo.Motor;
import Vehiculo.Suspension;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import principal.Mejora;
import principal.Servicio;
import principal.Tecnico;

@Accessors
@SuppressWarnings("all")
public class Vehiculo {
  private Servicio servicio;
  
  private final String patente;
  
  private Cliente cliente;
  
  private float kilometraje;
  
  private MarcaModelo marcaYmodelo;
  
  private Motor estado;
  
  private Suspension suspension;
  
  private Cubierta delanteraDerecha;
  
  private Cubierta delanteraizquierda;
  
  private Cubierta traseraDerecha;
  
  private Cubierta traseraizquierda;
  
  public Vehiculo(final String patenteNueva, final Cliente clienteNuevo, final float kilometrajeInicial, final MarcaModelo marcaModeloNuevo, final Motor estado, final Suspension suspensionNueva, final Cubierta delanteraderechaNueva, final Cubierta delanteraizquierdaNueva, final Cubierta traseraDerecha, final Cubierta traseraizquierda) {
    this.patente = patenteNueva;
    this.cliente = clienteNuevo;
    this.kilometraje = kilometrajeInicial;
    this.marcaYmodelo = marcaModeloNuevo;
    this.suspension = suspensionNueva;
  }
  
  public String getNombreCliente() {
    return this.cliente.getNombre();
  }
  
  public Cubierta rotarCubiertas() {
    Cubierta _xblockexpression = null;
    {
      Cubierta cambio = this.delanteraDerecha;
      this.delanteraDerecha = this.traseraDerecha;
      this.traseraDerecha = cambio;
      cambio = this.delanteraizquierda;
      this.delanteraizquierda = this.traseraizquierda;
      _xblockexpression = this.traseraizquierda = cambio;
    }
    return _xblockexpression;
  }
  
  public Object asignarServicio(final Tecnico tecnico, final List<Mejora> mejoraspendiantes) {
    return null;
  }
  
  public float costoBase() {
    return this.marcaYmodelo.costo();
  }
  
  @Pure
  public Servicio getServicio() {
    return this.servicio;
  }
  
  public void setServicio(final Servicio servicio) {
    this.servicio = servicio;
  }
  
  @Pure
  public String getPatente() {
    return this.patente;
  }
  
  @Pure
  public Cliente getCliente() {
    return this.cliente;
  }
  
  public void setCliente(final Cliente cliente) {
    this.cliente = cliente;
  }
  
  @Pure
  public float getKilometraje() {
    return this.kilometraje;
  }
  
  public void setKilometraje(final float kilometraje) {
    this.kilometraje = kilometraje;
  }
  
  @Pure
  public MarcaModelo getMarcaYmodelo() {
    return this.marcaYmodelo;
  }
  
  public void setMarcaYmodelo(final MarcaModelo marcaYmodelo) {
    this.marcaYmodelo = marcaYmodelo;
  }
  
  @Pure
  public Motor getEstado() {
    return this.estado;
  }
  
  public void setEstado(final Motor estado) {
    this.estado = estado;
  }
  
  @Pure
  public Suspension getSuspension() {
    return this.suspension;
  }
  
  public void setSuspension(final Suspension suspension) {
    this.suspension = suspension;
  }
  
  @Pure
  public Cubierta getDelanteraDerecha() {
    return this.delanteraDerecha;
  }
  
  public void setDelanteraDerecha(final Cubierta delanteraDerecha) {
    this.delanteraDerecha = delanteraDerecha;
  }
  
  @Pure
  public Cubierta getDelanteraizquierda() {
    return this.delanteraizquierda;
  }
  
  public void setDelanteraizquierda(final Cubierta delanteraizquierda) {
    this.delanteraizquierda = delanteraizquierda;
  }
  
  @Pure
  public Cubierta getTraseraDerecha() {
    return this.traseraDerecha;
  }
  
  public void setTraseraDerecha(final Cubierta traseraDerecha) {
    this.traseraDerecha = traseraDerecha;
  }
  
  @Pure
  public Cubierta getTraseraizquierda() {
    return this.traseraizquierda;
  }
  
  public void setTraseraizquierda(final Cubierta traseraizquierda) {
    this.traseraizquierda = traseraizquierda;
  }
}

package Vehiculo;

import Vehiculo.Cliente;
import Vehiculo.Cubierta;
import Vehiculo.MarcaModelo;
import Vehiculo.Motor;
import Vehiculo.Suspension;
import java.util.Map;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import principal.Servicio;

@Accessors
@SuppressWarnings("all")
public class Vehiculo {
  private Servicio servicio;
  
  private String patente;
  
  private Cliente cliente;
  
  private float kilometraje;
  
  private MarcaModelo marcaYmodelo;
  
  private Motor motor;
  
  private Map<String, Suspension> suspension;
  
  private Map<String, Cubierta> cubiertas;
  
  public Vehiculo(final String patenteNueva, final Cliente clienteNuevo, final float kilometrajeInicial, final MarcaModelo marcaModeloNuevo, final Motor estado, final Map<String, Cubierta> cubiertasNuevas, final Map<String, Suspension> suspensionNueva) {
    this.patente = patenteNueva;
    this.cliente = clienteNuevo;
    this.kilometraje = kilometrajeInicial;
    this.marcaYmodelo = marcaModeloNuevo;
    this.motor = estado;
    this.suspension = suspensionNueva;
    this.cubiertas = cubiertasNuevas;
  }
  
  public Vehiculo() {
  }
  
  public String getNombreCliente() {
    return this.cliente.getNombre();
  }
  
  public Cubierta rotarCubiertas() {
    Cubierta _xblockexpression = null;
    {
      Cubierta temporal = this.cubiertas.get("derechaDelantera");
      this.cubiertas.replace("derechaDelantera", this.cubiertas.get("derechaTrasera"));
      this.cubiertas.replace("derechaTrasera", temporal);
      temporal = this.cubiertas.get("izquierdaDelantera");
      this.cubiertas.replace("izquierdaDelantera", this.cubiertas.get("izquierdaTrasera"));
      _xblockexpression = this.cubiertas.replace("izquierdaTrasera", temporal);
    }
    return _xblockexpression;
  }
  
  public Servicio asignarServicio(final Servicio nuevo) {
    return this.servicio = nuevo;
  }
  
  public void arreglar() {
    this.servicio.ejecutar();
  }
  
  public double costoBase() {
    return this.marcaYmodelo.getCosto();
  }
  
  public double costoTotal() {
    return this.servicio.calcularCosto();
  }
  
  public Object repararCubierta(final String llave) {
    return this.cubiertas.get(llave).reparar();
  }
  
  public float repararSuspension(final String string) {
    return this.suspension.get(string).reparar();
  }
  
  public void regulacionMotor() {
    this.motor.arreglarMotor();
  }
  
  public boolean getStatus() {
    return this.motor.getStatus();
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
  
  public void setPatente(final String patente) {
    this.patente = patente;
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
  public Motor getMotor() {
    return this.motor;
  }
  
  public void setMotor(final Motor motor) {
    this.motor = motor;
  }
  
  @Pure
  public Map<String, Suspension> getSuspension() {
    return this.suspension;
  }
  
  public void setSuspension(final Map<String, Suspension> suspension) {
    this.suspension = suspension;
  }
  
  @Pure
  public Map<String, Cubierta> getCubiertas() {
    return this.cubiertas;
  }
  
  public void setCubiertas(final Map<String, Cubierta> cubiertas) {
    this.cubiertas = cubiertas;
  }
}

package parcial;

import Vehiculo.Cliente;
import Vehiculo.ControladorVerdadero;
import Vehiculo.Cubierta;
import Vehiculo.MarcaModelo;
import Vehiculo.Motor;
import Vehiculo.Suspension;
import Vehiculo.Vehiculo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.junit.Before;
import parcial.controladorMock;
import principal.Mejora;
import principal.ReparacionCubiertas;
import principal.Servicio;
import principal.Tecnico;

@Accessors
@SuppressWarnings("all")
public class Datos {
  private Vehiculo auto;
  
  private String patente = "VBL 502";
  
  private Cliente cliente = new Cliente();
  
  private float kilometraje = 500;
  
  private MarcaModelo marca = ObjectExtensions.<MarcaModelo>operator_doubleArrow(new MarcaModelo(), ((Procedure1<MarcaModelo>) (MarcaModelo it) -> {
    it.setCosto(100);
  }));
  
  private ControladorVerdadero controlador = new controladorMock();
  
  private Motor motor = ObjectExtensions.<Motor>operator_doubleArrow(new Motor(), ((Procedure1<Motor>) (Motor it) -> {
    it.setControladorVerdadero(this.controlador);
  }));
  
  private Map<String, Suspension> suspension = new HashMap<String, Suspension>();
  
  private Map<String, Cubierta> cubiertas = new HashMap<String, Cubierta>();
  
  private ReparacionCubiertas reparacionCubiertas;
  
  private Tecnico tecnico = new Tecnico();
  
  private List<Mejora> mejorasPendientes = new ArrayList<Mejora>();
  
  private Servicio servicio = new Servicio(this.tecnico, this.mejorasPendientes);
  
  @Before
  public void init() {
    this.HacerMapCubiertas();
    this.HacerMapSuspension();
    this.crearReparacionCubiertas();
    this.crearAuto();
  }
  
  public Servicio crearAuto() {
    Servicio _xblockexpression = null;
    {
      Vehiculo _vehiculo = new Vehiculo(this.patente, this.cliente, this.kilometraje, this.marca, this.motor, this.cubiertas, this.suspension);
      this.auto = _vehiculo;
      _xblockexpression = this.auto.asignarServicio(this.servicio);
    }
    return _xblockexpression;
  }
  
  public Cubierta HacerMapCubiertas() {
    Cubierta _xblockexpression = null;
    {
      Cubierta _cubierta = new Cubierta();
      this.cubiertas.put("derechaDelantera", _cubierta);
      Cubierta _cubierta_1 = new Cubierta();
      this.cubiertas.put("izquierdaDelantera", _cubierta_1);
      Cubierta _cubierta_2 = new Cubierta();
      this.cubiertas.put("derechaTrasera", _cubierta_2);
      Cubierta _cubierta_3 = new Cubierta();
      _xblockexpression = this.cubiertas.put("izquierdaTrasera", _cubierta_3);
    }
    return _xblockexpression;
  }
  
  public Suspension HacerMapSuspension() {
    Suspension _xblockexpression = null;
    {
      Suspension _suspension = new Suspension(9);
      this.suspension.put("delantera", _suspension);
      Suspension _suspension_1 = new Suspension(12);
      _xblockexpression = this.suspension.put("trasera", _suspension_1);
    }
    return _xblockexpression;
  }
  
  public ReparacionCubiertas crearReparacionCubiertas() {
    ReparacionCubiertas _xblockexpression = null;
    {
      List<String> cubiertasAReparar = new ArrayList<String>();
      cubiertasAReparar.add("derechaDelantera");
      ReparacionCubiertas _reparacionCubiertas = new ReparacionCubiertas(cubiertasAReparar, this.auto);
      _xblockexpression = this.reparacionCubiertas = _reparacionCubiertas;
    }
    return _xblockexpression;
  }
  
  @Pure
  public Vehiculo getAuto() {
    return this.auto;
  }
  
  public void setAuto(final Vehiculo auto) {
    this.auto = auto;
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
  public MarcaModelo getMarca() {
    return this.marca;
  }
  
  public void setMarca(final MarcaModelo marca) {
    this.marca = marca;
  }
  
  @Pure
  public ControladorVerdadero getControlador() {
    return this.controlador;
  }
  
  public void setControlador(final ControladorVerdadero controlador) {
    this.controlador = controlador;
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
  
  @Pure
  public ReparacionCubiertas getReparacionCubiertas() {
    return this.reparacionCubiertas;
  }
  
  public void setReparacionCubiertas(final ReparacionCubiertas reparacionCubiertas) {
    this.reparacionCubiertas = reparacionCubiertas;
  }
  
  @Pure
  public Tecnico getTecnico() {
    return this.tecnico;
  }
  
  public void setTecnico(final Tecnico tecnico) {
    this.tecnico = tecnico;
  }
  
  @Pure
  public List<Mejora> getMejorasPendientes() {
    return this.mejorasPendientes;
  }
  
  public void setMejorasPendientes(final List<Mejora> mejorasPendientes) {
    this.mejorasPendientes = mejorasPendientes;
  }
  
  @Pure
  public Servicio getServicio() {
    return this.servicio;
  }
  
  public void setServicio(final Servicio servicio) {
    this.servicio = servicio;
  }
}

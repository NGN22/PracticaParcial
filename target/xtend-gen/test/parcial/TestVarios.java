package parcial;

import Vehiculo.Vehiculo;
import org.junit.Assert;
import org.junit.Test;
import parcial.Datos;
import principal.LavadoAuto;
import principal.RegulacionMotor;
import principal.RotacionCubiertas;
import principal.SuspensionReparacion;

@SuppressWarnings("all")
public class TestVarios extends Datos {
  @Test
  public void testCostoLavadoservicio() {
    Vehiculo _auto = this.getAuto();
    LavadoAuto lavado = new LavadoAuto(_auto);
    this.getMejorasPendientes().add(lavado);
    Assert.assertEquals(this.getServicio().calcularCosto(), 100, 0);
  }
  
  @Test
  public void conseguirEstado() {
    Assert.assertTrue(this.getAuto().getStatus());
  }
  
  @Test
  public void testCostolavadomasauto() {
    Vehiculo _auto = this.getAuto();
    LavadoAuto lavado = new LavadoAuto(_auto);
    this.getMejorasPendientes().add(lavado);
    Assert.assertEquals(this.getAuto().costoTotal(), 100, 0);
  }
  
  @Test
  public void testCostolavadomaRotacionsauto100mas300() {
    Vehiculo _auto = this.getAuto();
    LavadoAuto lavado = new LavadoAuto(_auto);
    Vehiculo _auto_1 = this.getAuto();
    RotacionCubiertas rotacion = new RotacionCubiertas(_auto_1);
    this.getMejorasPendientes().add(lavado);
    this.getMejorasPendientes().add(rotacion);
    Assert.assertEquals(this.getAuto().costoTotal(), 400, 0);
  }
  
  @Test
  public void testCostoRegulacion() {
    Vehiculo _auto = this.getAuto();
    RegulacionMotor regulacion = new RegulacionMotor(30, true, _auto);
    this.getMejorasPendientes().add(regulacion);
    Assert.assertEquals(this.getAuto().costoTotal(), 2600, 0);
  }
  
  @Test
  public void testControladorEstadoMotorNoEstaBien() {
    Assert.assertFalse(this.getControlador().estadoRpm());
  }
  
  @Test
  public void testServicioConsentidoSearreglaMotorcambiA1000() {
    Vehiculo _auto = this.getAuto();
    RegulacionMotor regulacion = new RegulacionMotor(30, true, _auto);
    this.getMejorasPendientes().add(regulacion);
    this.getAuto().arreglar();
    Assert.assertEquals(this.getControlador().getRpm(), 1000);
  }
  
  @Test
  public void testControladorDe800A1000() {
    this.getControlador().verRpm();
    Assert.assertEquals(this.getControlador().getRpm(), 1000);
  }
  
  @Test
  public void testSuspensionDe12a0() {
    Vehiculo _auto = this.getAuto();
    SuspensionReparacion reparacionSuspension = new SuspensionReparacion("trasera", _auto);
    this.getMejorasPendientes().add(reparacionSuspension);
    this.getAuto().arreglar();
    Assert.assertEquals(this.getSuspension().get("trasera").getDesgaste(), 0, 0);
  }
}

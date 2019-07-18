package parcial

import org.junit.Assert
import org.junit.Test
import principal.RegulacionMotor
import principal.RotacionCubiertas
import principal.SuspensionReparacion
import principal.LavadoAuto

class TestVarios extends Datos {
	
	
	@Test
	def testCostoLavadoservicio(){
		var LavadoAuto lavado = new LavadoAuto(auto)
		mejorasPendientes.add(lavado)
		Assert.assertEquals( servicio.calcularCosto , 100,0 )
	}
	
	@Test
	def conseguirEstado(){
		Assert.assertTrue( auto.getStatus )
	}
	
	
	@Test
	def void testCostolavadomasauto(){
		var LavadoAuto lavado = new LavadoAuto(auto)
		mejorasPendientes.add(lavado)
		
		Assert.assertEquals( auto.costoTotal , 100,0 )
	}
	
	@Test
	def testCostolavadomaRotacionsauto100mas300(){
		var LavadoAuto lavado = new LavadoAuto(auto) // 100
		var RotacionCubiertas rotacion = new RotacionCubiertas(auto) //100 + 200
		mejorasPendientes.add(lavado)
		mejorasPendientes.add(rotacion)
		Assert.assertEquals( auto.costoTotal , 400 ,0 )
	}
	
	@Test
	def testCostoRegulacion(){
		var RegulacionMotor regulacion = new RegulacionMotor(30,true,auto)
		mejorasPendientes.add(regulacion)
		Assert.assertEquals( auto.costoTotal , 2600 ,0 )
	}
	
	@Test
	def testControladorEstadoMotorNoEstaBien(){
		Assert.assertFalse(controlador.estadoRpm )
	}
	
	@Test
	def testServicioConsentidoSearreglaMotorcambiA1000(){
		var RegulacionMotor regulacion = new RegulacionMotor(30,true,auto)
		mejorasPendientes.add(regulacion)
		auto.arreglar
		Assert.assertEquals(controlador.rpm,1000 )
	}
	
		
	@Test
	def testControladorDe800A1000(){
		getControlador.verRpm
		Assert.assertEquals(controlador.rpm,1000 )
	}
	
	
	@Test
	def testSuspensionDe12a0(){
		var	SuspensionReparacion reparacionSuspension = new SuspensionReparacion("trasera", auto)
		mejorasPendientes.add(reparacionSuspension)
		auto.arreglar
		Assert.assertEquals(suspension.get("trasera").desgaste,0,0 )
	}
		
	
	
	
	
	
	
}
	

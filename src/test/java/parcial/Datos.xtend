package parcial

import Vehiculo.Cliente
import Vehiculo.ControladorVerdadero
import Vehiculo.Cubierta
import Vehiculo.MarcaModelo
import Vehiculo.Motor
import Vehiculo.Suspension
import Vehiculo.Vehiculo
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.junit.Before
import principal.Mejora
import principal.ReparacionCubiertas
import principal.Servicio
import principal.SuspensionReparacion
import principal.Tecnico

@Accessors
class Datos {

	Vehiculo auto

	var String patente = "VBL 502"
	Cliente cliente = new Cliente
	float kilometraje = 500
	MarcaModelo marca = new MarcaModelo => [costo = 100]
	var ControladorVerdadero controlador = new controladorMock
	Motor motor = new Motor => [ controladorVerdadero = controlador ]
	Map<String, Suspension> suspension = new HashMap<String, Suspension>
	Map<String, Cubierta> cubiertas = new HashMap<String, Cubierta>

	ReparacionCubiertas reparacionCubiertas


	Tecnico tecnico = new Tecnico

	var List<Mejora> mejorasPendientes = new ArrayList<Mejora>

	Servicio servicio = new Servicio(tecnico, mejorasPendientes)



	@Before def void init() {
		HacerMapCubiertas
		HacerMapSuspension
		crearReparacionCubiertas
		crearAuto
	}

	def crearAuto() {
		auto = new Vehiculo(patente, cliente, kilometraje, marca, motor, cubiertas, suspension)
		auto.asignarServicio(servicio)
	}

	def HacerMapCubiertas() {
		cubiertas.put("derechaDelantera", new Cubierta)
		cubiertas.put("izquierdaDelantera", new Cubierta)
		cubiertas.put("derechaTrasera", new Cubierta)
		cubiertas.put("izquierdaTrasera", new Cubierta)
	}

	def HacerMapSuspension() {
		suspension.put("delantera", new Suspension(9))
		suspension.put("trasera", new Suspension(12))
	}

	def crearReparacionCubiertas() {
		var List<String> cubiertasAReparar = new ArrayList<String>()
		cubiertasAReparar.add("derechaDelantera")
		reparacionCubiertas = new ReparacionCubiertas(cubiertasAReparar, auto)

	}

}

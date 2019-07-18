package Vehiculo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import principal.Mejora
import principal.Servicio
import principal.Tecnico
import java.util.Map

@Accessors
class Vehiculo {

	Servicio servicio

	String patente
	Cliente cliente
	var float kilometraje
	MarcaModelo marcaYmodelo
	Motor motor
	var Map<String, Suspension> suspension
	var Map<String, Cubierta> cubiertas

	new(String patenteNueva, Cliente clienteNuevo, float kilometrajeInicial, MarcaModelo marcaModeloNuevo, Motor estado,
		Map<String, Cubierta> cubiertasNuevas, Map<String, Suspension> suspensionNueva) {
		patente = patenteNueva
		cliente = clienteNuevo
		kilometraje = kilometrajeInicial
		marcaYmodelo = marcaModeloNuevo
		motor = estado
		suspension = suspensionNueva
		cubiertas = cubiertasNuevas
	}
	
	new() {
	}


	def getNombreCliente() {
		cliente.nombre
	}

	def rotarCubiertas() {
		var Cubierta temporal = cubiertas.get("derechaDelantera")
		cubiertas.replace('derechaDelantera', cubiertas.get("derechaTrasera"))
		cubiertas.replace('derechaTrasera', temporal)
		temporal = cubiertas.get("izquierdaDelantera")
		cubiertas.replace('izquierdaDelantera', cubiertas.get("izquierdaTrasera"))
		cubiertas.replace('izquierdaTrasera', temporal)

	}

	def asignarServicio(Servicio nuevo) {
		servicio = nuevo
	}

	def arreglar() {
		servicio.ejecutar
	}

	def double costoBase() {
		marcaYmodelo.getCosto()
	}

	def costoTotal() { servicio.calcularCosto }

	def repararCubierta(String llave) {
		cubiertas.get(llave).reparar()

	}

	def repararSuspension(String string) {
		suspension.get(string).reparar()
	}

	def regulacionMotor() {
		motor.arreglarMotor
	}

	def getStatus() {
		motor.getStatus
	}

}

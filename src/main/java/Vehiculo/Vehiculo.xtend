package Vehiculo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import principal.Mejora
import principal.Servicio
import principal.Tecnico

@Accessors
class Vehiculo {
	
	Servicio servicio
	
	val String patente
	Cliente cliente
	var float kilometraje
	MarcaModelo marcaYmodelo
	Motor estado
	Suspension suspension
	Cubierta delanteraDerecha
	Cubierta delanteraizquierda
	Cubierta traseraDerecha
	Cubierta traseraizquierda
	
	new(String patenteNueva, Cliente clienteNuevo,
		float kilometrajeInicial, MarcaModelo marcaModeloNuevo,
		Motor estado,Suspension suspensionNueva,
		Cubierta delanteraderechaNueva,
		Cubierta delanteraizquierdaNueva,
		Cubierta traseraDerecha,
		Cubierta traseraizquierda){
		patente = patenteNueva
		cliente = clienteNuevo
		kilometraje = kilometrajeInicial
		marcaYmodelo = marcaModeloNuevo
		suspension = suspensionNueva
		
	}
	
	def getNombreCliente() {
		cliente.nombre
	}
	
		
	def rotarCubiertas() {
		var Cubierta cambio = delanteraDerecha
		delanteraDerecha = traseraDerecha
		traseraDerecha = cambio
		cambio = delanteraizquierda
		delanteraizquierda = traseraizquierda
		traseraizquierda = cambio
	}

	def asignarServicio(Tecnico tecnico, List<Mejora> mejoraspendiantes ){
		
	}
	
	def costoBase() {
		marcaYmodelo.costo()
	}
	
}












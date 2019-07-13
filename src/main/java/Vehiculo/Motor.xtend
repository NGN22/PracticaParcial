package Vehiculo

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Motor {

	var ControladorVerdadero controladorVerdadero

	def estado() {
		controladorVerdadero.comoEstaElMotor()
	}
	
	def reguladorBujias(){
		
	}
	
	
	
}

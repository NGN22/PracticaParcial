package Vehiculo

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Motor {

	var ControladorVerdadero controladorVerdadero = new ControladorVerdadero
	var boolean estado

	new() {
		estado = getStatus()
	}
	
	def arreglarMotor(){
		ajustarRpm
		regularBujias
	}
	
	def getStatus() {
		controladorVerdadero.comoEstaElMotor()
	}

	def ajustarRpm() {
		controladorVerdadero.ajustarRpm()
	}

	def regularBujias(){
		controladorVerdadero.regularBujias()
	}

}

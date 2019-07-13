package Vehiculo

class ControladorVerdadero implements Controlador {
	
	
	def regularBujias(){
		arreglarBujias()
	}
	
	def arreglarBujias() {
	
		}
	
	def comoEstaElMotor(){
		comprobacion
	}
	
	def comprobacion(){
		status == 0
	}
	
	def void ajustarRpm(){
		if (getRpm != 200){
			verificarMotor(1  )
		}
	}
	
	
	
	
	def verificarMotor(int variable){
		
		val bloque = [ int numero | setRpm( numero ) ]
		//bloque.apply()
	}
	
	def disminuir() {
		-1
	}
	
	def aumentar(){
		1
	}
	
	
	
	
	
}
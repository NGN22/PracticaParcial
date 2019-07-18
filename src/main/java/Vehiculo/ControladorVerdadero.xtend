package Vehiculo

class ControladorVerdadero implements Controlador {

	def regularBujias() {
		#[1..getSparkPlugsLength].forEach[ iterado | fixSparkPlug(iterado.step) ]
	}

	
	def comoEstaElMotor() {
		comprobacion
	}

	def comprobacion() {
		status == 0
	}

	def void ajustarRpm() {
		if (!estadoRpm) {
			verRpm()
		}
	}
	
	def estadoRpm(){
		getRpm == 1000
	}

	def verRpm(){
		if( !estadoRpm ) { verificarMotor }  
	}

	def void verificarMotor() {
		if( condicionMotor ) { disminuir } else aumentar
	}

	def boolean condicionMotor(){
		getRpm > 1000 
	}

	
	def disminuir() {
		mandarRpm(-1)
		verRpm()
	}

	def aumentar() {
		mandarRpm(1)
		verRpm()
	}

	def mandarRpm(int numero){
		setRpm(numero*10)
	}
	
	


}

package Vehiculo

interface Controlador {

	
	def int getRpm() { rpm }

	def void setRpm(int i) {  }

	def void fixSparkPlug(int i) {}

	def int getSparkPlugsLength() { 0 }

	def int status() { 0 }

}

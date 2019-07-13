package Vehiculo

interface Controlador {
	
	
	def int getRpm(){ 0 }
	
	def void setRpm( int i ){}
	
	def void fixSparkPlug( int i ){}
	
	def int getSparkPlug(){0}
	
	def int status(){0}
	
	
}
package parcial

import Vehiculo.ControladorVerdadero

class controladorMock extends ControladorVerdadero {
	
	var int rpm = 800
	override setRpm(int i){  rpm = rpm + i }
	
	override int getRpm() { rpm }

	override void fixSparkPlug(int i) {}

	override int getSparkPlugsLength() { 0 }

	override int status() { 0 }
}
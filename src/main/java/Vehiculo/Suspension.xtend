package Vehiculo

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Suspension {
	float desgaste

	new (float nuevo){
		desgaste = nuevo
	}
	def reparar() {
		desgaste = 0
	}

}

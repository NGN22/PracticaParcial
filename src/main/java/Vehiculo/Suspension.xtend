package Vehiculo

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Suspension {
	float medida

	def reparar() {
		medida = 0
	}

}

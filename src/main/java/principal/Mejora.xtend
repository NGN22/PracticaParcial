package principal

import Vehiculo.Cubierta
import Vehiculo.Vehiculo
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import java.time.LocalDate
import Vehiculo.Suspension

@Accessors
abstract class Mejora {

	Vehiculo vehiculo

	def void ejecutar()

	def float calcularCosto() { vehiculo.costoBase() }

}

class ReparacionCubiertas extends Mejora {

	List<Cubierta> cubiertas

	override ejecutar() {
		cubiertas.forEach[cubierta|cubierta.reparar]
	}

	override calcularCosto() {
		super.calcularCosto +  cubiertas.size * 200
	}
}

class RotacionCubiertas extends Mejora {

	override ejecutar() {
		vehiculo.rotarCubiertas()
	}

	override calcularCosto() {
		super.calcularCosto + 200
	}

}

class SuspensionReparacion extends Mejora {
	Suspension suspensionInvolucrada

	override ejecutar() {
		suspensionInvolucrada.reparar()
	}

	override calcularCosto() {
		super.calcularCosto + ( vehiculo.marcaYmodelo.costoBaseSuspension * 2 )
	}
}

class lavado extends Mejora {

	override ejecutar() {
	}
	
	
}

class RegulacionMotor extends Mejora {

	int tiempo = 0
	boolean desmonte = false

	override ejecutar() {
	}

}

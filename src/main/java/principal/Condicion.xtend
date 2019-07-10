package principal

import Vehiculo.MarcaModelo
import Vehiculo.Vehiculo
import java.util.ArrayList
import java.util.List

class CondicionSimple {
	def laCondicionEsAceptada(Vehiculo vehiculo) {
		true
	}
}

class CondicionMarca extends CondicionSimple {
	val MarcaModelo aceptado

	new(MarcaModelo NuevaCondicion) {
		aceptado = NuevaCondicion
	}

	override laCondicionEsAceptada(Vehiculo nuevoVehiculo) {
		nuevoVehiculo.marcaYmodelo == aceptado
	}
}

class CondicionNombre extends CondicionSimple {
	val String aceptado

	new(String NuevaCondicion) {
		aceptado = NuevaCondicion
	}

	override laCondicionEsAceptada(Vehiculo nuevoVehiculo) {
		nuevoVehiculo.nombreCliente != aceptado
	}
}

class CondicionCompuestaNoExcluyente extends CondicionSimple {
	var List<CondicionSimple> condiciones = new ArrayList<CondicionSimple>()

	override laCondicionEsAceptada(Vehiculo nuevoVehiculo) {
		condiciones.exists[condicion|condicion.laCondicionEsAceptada(nuevoVehiculo)]
	}
}

class CondicionCompuestaExcluyente extends CondicionSimple {
	var List<CondicionSimple> condiciones = new ArrayList<CondicionSimple>()

	override laCondicionEsAceptada(Vehiculo nuevoVehiculo) {
		condiciones.forall[condicion|condicion.laCondicionEsAceptada(nuevoVehiculo)]
	}

}

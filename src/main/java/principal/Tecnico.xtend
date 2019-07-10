package principal

import Vehiculo.Vehiculo
import java.util.ArrayList
import java.util.List

class Tecnico {

	var List<Vehiculo> vehiculosAsignados = new ArrayList<Vehiculo>()
	var List<CondicionSimple> condiciones = new ArrayList<CondicionSimple>()

	def acepta(Vehiculo vehiculo) {
		condiciones.forall[condicion|condicion.laCondicionEsAceptada(vehiculo)]
	}

	def asignar(Vehiculo vehiculo) {
		vehiculosAsignados.add(vehiculo)

	}

}

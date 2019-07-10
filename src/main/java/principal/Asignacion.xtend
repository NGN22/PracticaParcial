package principal

import java.util.ArrayList
import java.util.List
import Vehiculo.Vehiculo

class Asignacion {
	var List<Tecnico> tecnicos = new ArrayList<Tecnico>()

	def asignacionAutomatica(Vehiculo vehiculo) {
		if (!hayTecnicos(vehiculo)) {
			throw new myException("Se requiere asignacion manual ")
		}
		asignarTecnico(vehiculo, primerTecnico(vehiculo))
	}

	def primerTecnico(Vehiculo vehiculo) {
		listaTecnicos(vehiculo).head
	}

	def hayTecnicos(Vehiculo vehiculo) {
		listaTecnicos(vehiculo).size !== 0
	}

	def listaTecnicos(Vehiculo vehiculo) {
		tecnicos.filter[tecnico|tecnico.acepta(vehiculo)].toList
	}

	def asignarTecnico(Vehiculo vehiculo, Tecnico tecnico) {
		tecnico.asignar(vehiculo)
	}

}

class myException extends Exception {
	new(String msg) {
		super(msg)
	}
}

package principal

import java.time.LocalDate
import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Servicio {

	List<Mejora> mejoras = new ArrayList<Mejora>
	Tecnico tecnicoAsignado = new Tecnico
	LocalDate fechaDeHoy = LocalDate.now

	new(Tecnico tecnico, List<Mejora> mejoraspendientes) {
		tecnicoAsignado = tecnico
		mejoras = mejoraspendientes
	}
	
	new() {
	}

	def ejecutar() {
		mejoras.forEach[mejora|mejora.ejecutar]
	}
	
	//itemsQueLoComponen.fold(0.0, [acumulador, item|acumulador + item.poderDeAtaqueItem()])
	def double calcularCosto() {
		mejoras.fold(0.0, [acumulador, mejora | acumulador + mejora.calcularCosto() ])
	}

}

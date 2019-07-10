package principal

import java.time.LocalDate
import java.util.List

class Servicio {

	List<Mejora> mejoras
	Tecnico tecnicoAsignado
	LocalDate fechaDeHoy

	new(Tecnico tecnico, List<Mejora> mejoraspendientes) {
		tecnicoAsignado = tecnico
		mejoras = mejoraspendientes
		fechaDeHoy = LocalDate.now
	}

	def ejecutar() {
		mejoras.forEach[mejora|mejora.ejecutar]
	}

	def double calcularCosto() {
		mejoras.fold(0.0, [acumulador, mejora|(mejora.calcularCosto()) + acumulador])
	}

}

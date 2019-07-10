import Vehiculo.Vehiculo
import principal.Asignacion
import principal.Tecnico

class Taller {
	Asignacion asignacion = new Asignacion()

	def agregarVehiculo(Vehiculo nuevoVehiculo) {
		asignacion.asignacionAutomatica(nuevoVehiculo)
	}

	def agregarVehiculoManual(Vehiculo nuevoVehiculo, Tecnico tecnico) {
		asignacion.asignarTecnico(nuevoVehiculo, tecnico)
	}

}

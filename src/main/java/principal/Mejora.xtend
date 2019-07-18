package principal

import Vehiculo.Vehiculo
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Mejora {

	var Vehiculo vehiculo 
	
	def void ejecutar(){}

	def double calcularCosto() { vehiculo.costoBase }

}

class ReparacionCubiertas extends Mejora {

	List<String> cubiertasAReparar

	new(List<String> listaCubiertasMejorar, Vehiculo auto ) {
		vehiculo = auto
		cubiertasAReparar = listaCubiertasMejorar
	}

	override ejecutar() {
		cubiertasAReparar.forEach[elemento|reparar(elemento)]
	}

	def reparar(String key) {
		vehiculo.repararCubierta(key)
	}

	override calcularCosto() {
		super.calcularCosto + cubiertasAReparar.size() * 200
	}
}

class RotacionCubiertas extends Mejora {

	new (Vehiculo auto ){
		vehiculo = auto
	}
	override ejecutar() {
		vehiculo.rotarCubiertas()
	}

	override calcularCosto() {
		super.calcularCosto + 200
	}

}

class SuspensionReparacion extends Mejora {
	String suspensionInvolucrada = " "

	new(String suspensionNueva, Vehiculo auto ) {
		vehiculo = auto
		suspensionInvolucrada = suspensionNueva
	}

	override ejecutar() {
		vehiculo.repararSuspension(suspensionInvolucrada)
	}

	override calcularCosto() {
		super.calcularCosto * 2
	}
}

class LavadoAuto extends Mejora {

	new ( Vehiculo auto ){
		vehiculo = auto
	}
	
}

class RegulacionMotor extends Mejora {

	int tiempo
	boolean desmonte

	new(int demora, boolean validacionDesmonte, Vehiculo auto) {
		tiempo = demora
		desmonte = validacionDesmonte
		vehiculo = auto
	}

	override ejecutar() {
		vehiculo.regulacionMotor()
	}

	override calcularCosto() {
		super.calcularCosto + sumarAdicionales()
	}

	def sumarAdicionales() {
		adicionalDesmonte() + adicionalTiempo()
	}

	def adicionalTiempo() {
		if(desmonte) 1000 else 0
	}

	def adicionalDesmonte() {
		if(tiempo > 20) 1500 else 0
	}

}

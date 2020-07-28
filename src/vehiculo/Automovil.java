package vehiculo;

public class Automovil extends Vehiculos {
	private String patente;
	
	public Automovil(String marca, String modelo, String patente, int velocidadMaxima, int velocidadActual) {
		super(marca, modelo, velocidadMaxima, velocidadActual);
		this.patente = patente;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}

}

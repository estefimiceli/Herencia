package vehiculo;

public class Camion extends Vehiculos {
	private String patente;
	private int cargaMaxima;
	private int cargaActual;
	
	public Camion(String marca, String modelo, String patente, int velocidadMaxima, int velocidadActual, int cargaMaxima, int cargaActual) {
		super(marca, modelo, velocidadMaxima, velocidadActual);
		this.cargaMaxima = cargaMaxima;
		this.cargaActual = cargaActual;
		this.patente = patente;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	
	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	public int getCargaActual() {
		return cargaActual;
	}
	
	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}
	
	public String getMarca() {
		return "Marca de camion " + this.marca; 
	}

}

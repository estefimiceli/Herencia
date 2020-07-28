package vehiculo;

public class Motocicleta extends Vehiculos {
	private String cilindrada;
	
	public Motocicleta(String marca, String modelo, String cilindrada, int velocidadMaxima, int velocidadActual) {
		super(marca, modelo, velocidadMaxima, velocidadActual);
		this.cilindrada = cilindrada;
	}
	
	public String getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String getMarca(String text) {
		return text + " " + this.marca; 
	}
}

package vehiculo;

public class Vehiculos {
	protected String marca; //protected indica q la visibilidad es de la clase padre y de las clases hijas
	protected String modelo;
	protected int velocidadMaxima;
	protected int velocidadActual;
	
	public Vehiculos(String marca, String modelo, int velocidadMaxima, int velocidadActual) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

}

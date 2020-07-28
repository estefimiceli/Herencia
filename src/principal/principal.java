package principal;

import vehiculo.Automovil;
import vehiculo.Camion;
import vehiculo.Motocicleta;

public class principal {

	public static void main(String[] args) {
		Automovil auto = new Automovil("ford", "falcon", "123aqw", 200, 140);
		Motocicleta moto = new Motocicleta("zanella", "a", "2", 120, 80);
		Camion camion = new Camion("scania", "b", "123aqw", 200, 140, 300, 150);
		
		System.out.println(auto.getMarca());
		System.out.println(moto.getMarca());
		System.out.println(moto.getMarca("La marca de moto es"));
		System.out.println(camion.getMarca());
	}

}

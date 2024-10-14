package consecionariaVehiculos.main;

public class Main {

	public static void main(String[] args) {
		System.out.print("----------CONSECIONARIA VEHICULOS DATOS AUTOS--------------");
		Auto auto = new Auto(new MotorAuto(), new RuedasAuto(), new CarroceriaAuto());
		System.out.print("\n"+auto.datos());
		System.out.print("\n----------CONSECIONARIA VEHICULOS DATOS MOTOS--------------");
		Moto moto = new Moto(new MotorMoto(), new RuedasMoto(), new CarroceriaMoto());
		System.out.print("\n"+moto.datos());;
	}

}

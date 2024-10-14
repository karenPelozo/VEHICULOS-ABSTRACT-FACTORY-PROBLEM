package consecionariaVehiculos.main;

public class Auto {
	 private MotorAuto motor;
	    private RuedasAuto ruedas;
	    private CarroceriaAuto carroceria;

	    public Auto(MotorAuto motor, RuedasAuto ruedas, CarroceriaAuto carroceria) {
	        this.motor = motor;
	        this.ruedas = ruedas;
	        this.carroceria = carroceria;
	    }

	    public String datos() {
	        return motor.tamanioMotor() + "\n " + ruedas.cantidadRuedas() + "\n " + carroceria.colorCarroceria();
	    }
}

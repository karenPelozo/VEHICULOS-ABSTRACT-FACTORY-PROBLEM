package consecionariaVehiculos.main;

public class Moto {
	private MotorMoto motor;
    private RuedasMoto ruedas;
    private CarroceriaMoto carroceria;

    public Moto(MotorMoto motor, RuedasMoto ruedas, CarroceriaMoto carroceria) {
        this.motor = motor;
        this.ruedas = ruedas;
        this.carroceria = carroceria;
    }

    public String datos() {
        return motor.tamanioMotor() + "\n " + ruedas.cantidadRuedas() + "\n " + carroceria.colorCarroceria();
    } 
}

package associacao.composicao;

public class Carro {
    // Atributo do tipo motor
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Carro(int cilidradas) {
        this.motor = new Motor(cilidradas);
    }

    public void mostrarCilidradas() {
        System.out.println("Carro com motor de " + motor.getCilidradas() + " cilindradas");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}

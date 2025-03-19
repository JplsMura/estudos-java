package contabancaria;

public class ContaBancaria {

    private String titular;
    private double saldo;

    // Construct
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters e Setters - metodos usados para acessar e modificar os atributos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

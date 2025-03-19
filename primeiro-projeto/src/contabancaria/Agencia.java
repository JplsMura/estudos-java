package contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(
                "João Pedro",
                100.00
        );

        minhaConta.setTitular("João Pedro Lima Santos");
        minhaConta.setSaldo(minhaConta.getSaldo() + 1000.00);

        String titularConta = minhaConta.getTitular();
        double saldoConta = minhaConta.getSaldo();

        System.out.println(titularConta + " seu saldo é de : " + saldoConta);
    }
}

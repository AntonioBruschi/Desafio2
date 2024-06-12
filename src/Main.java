import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(101, 1500.00);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.00);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.00);

        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        ContaBancaria contaMaiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}

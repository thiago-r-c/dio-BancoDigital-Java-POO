public class ContaCorrente extends Conta {

	private static final double LIMITE_SAQUE = 500; // Limite de saque de 500

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + LIMITE_SAQUE)) {
            saldo -= valor;
            System.out.println(String.format("Saque de %.2f realizado com sucesso", valor));
        } else {
            System.out.println("Limite de saque excedido");
        }
    }
}
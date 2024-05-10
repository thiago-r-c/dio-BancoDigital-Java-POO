public class ContaPoupanca extends Conta {

	private static final double TAXA_JUROS = 0.05; // Taxa de juros de 5%

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public void aplicarJuros() {
        double juros = getSaldo() * TAXA_JUROS;
        depositar(juros);
        System.out.println(String.format("Juros aplicados: %.2f", juros));
    }
}

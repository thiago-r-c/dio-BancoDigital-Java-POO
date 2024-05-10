import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>(); // Inicialização da lista de contas
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    public void listarContas() {
        System.out.println("=== Contas do Banco " + nome + " ===");
        for (Conta conta : contas) {
            System.out.println("Agência: " + conta.getAgencia() + ", Número: " + conta.getNumero());
        }
    }

    public void listarClientes() {
        System.out.println("=== Clientes do Banco " + nome + " ===");
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            System.out.println("Cliente: " + cliente.getNome());
        }
    }
}

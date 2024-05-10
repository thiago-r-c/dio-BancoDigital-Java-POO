public class Main {

    public static void main(String[] args) {
        // Criando um cliente
        Cliente ClienteBanco = new Cliente("Thiago", "123456789", "Rua X");

        // Criando um banco
        Banco banco = new Banco("Meu Banco");

        // Criando uma conta corrente e adicionando ao banco
        Conta cc = new ContaCorrente(ClienteBanco);
        banco.adicionarConta(cc);

        // Criando uma conta poupança e adicionando ao banco
        Conta poupanca = new ContaPoupanca(ClienteBanco);
        banco.adicionarConta(poupanca);

        // Realizando operações nas contas
        cc.depositar(100);
        cc.transferir(100, poupanca);

        // Listando contas e clientes
        banco.listarContas();
        banco.listarClientes();
    }
}

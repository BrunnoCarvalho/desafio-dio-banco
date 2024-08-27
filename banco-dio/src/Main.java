public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente novoCliente = new Cliente();
        cliente.setNome("Bruno");
        cliente.setCpf("333.321.333-33");

        novoCliente.setNome("Ronan");
        novoCliente.setCpf("231.321.333-33");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        Conta contaCorrente = new ContaCorrente(novoCliente);
        Conta contaPoupanca = new ContaPoupanca(novoCliente);

        Banco banco = new Banco();

        banco.setNome("Banri");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        banco.adicionarConta(contaPoupanca);
        banco.adicionarConta(contaCorrente);

        cc.depositar(100);
        cc.transferir(10, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.clientesDoBanco();
    }
}

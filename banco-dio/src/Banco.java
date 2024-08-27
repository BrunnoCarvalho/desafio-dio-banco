import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(){
        contas = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta){
         contas.add(conta);
    }

    public void clientesDoBanco(){

        Set<Cliente> clientesBanco = new HashSet<>();

        for (Conta conta: contas){
            clientesBanco.add(conta.cliente);
        }

        System.out.println();
        System.out.println(String.format(" === Clientes do Banco %s === ", getNome()));
        
        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNome());  
        }
    }

}

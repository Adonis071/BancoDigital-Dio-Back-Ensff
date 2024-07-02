import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void removeConta(Conta conta) {
        contas.remove(conta);
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimirContas() {
        System.out.println("Lista de Contas do Banco " + nome + ":");
        for (Conta conta : contas) {
            System.out.println(conta);

        }
    }
}
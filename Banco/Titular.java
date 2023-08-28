package Banco;

public class Titular {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    public Titular(){}
    public Titular(int id, String nome, String cpf, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Titular [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone="
                + telefone + "]";
    }
    
}

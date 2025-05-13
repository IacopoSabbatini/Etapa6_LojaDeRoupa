
package roupas;

public class Endereco {
    private int id;
    private String nome;
    private String contato;
    private String cpf;
    private String endereco;
    private String pontoDeReferencia;

    public Endereco() {}

    public Endereco(int id, String nome, String contato, String cpf, String endereco, String pontoDeReferencia) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.endereco = endereco;
        this.pontoDeReferencia = pontoDeReferencia;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getPontoDeReferencia() { return pontoDeReferencia; }
    public void setPontoDeReferencia(String pontoDeReferencia) { this.pontoDeReferencia = pontoDeReferencia; }
}


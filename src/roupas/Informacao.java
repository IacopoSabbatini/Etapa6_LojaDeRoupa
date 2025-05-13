
package roupas;


public class Informacao {
     private int id;
    private String nomeDaEmpresa;
    private String cnpj;
    private String endereco;
    private String contato;
    private String campoDeObservacao;

    public Informacao() {}

    public Informacao(int id, String nomeDaEmpresa, String cnpj, String endereco, String contato, String campoDeObservacao) {
        this.id = id;
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.campoDeObservacao = campoDeObservacao;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomeDaEmpresa() { return nomeDaEmpresa; }
    public void setNomeDaEmpresa(String nomeDaEmpresa) { this.nomeDaEmpresa = nomeDaEmpresa; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public String getCampoDeObservacao() { return campoDeObservacao; }
    public void setCampoDeObservacao(String campoDeObservacao) { this.campoDeObservacao = campoDeObservacao; }
}


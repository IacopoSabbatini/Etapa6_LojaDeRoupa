
package roupas;

import java.util.Date;

public class Caixa {
      private int id;
    private String descricao;
    private String entradaOuSaida;
    private Date data;
    private double saldo;

    public Caixa() {}

    public Caixa(int id, String descricao, String entradaOuSaida, Date data, double saldo) {
        this.id = id;
        this.descricao = descricao;
        this.entradaOuSaida = entradaOuSaida;
        this.data = data;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getEntradaOuSaida() { return entradaOuSaida; }
    public void setEntradaOuSaida(String entradaOuSaida) { this.entradaOuSaida = entradaOuSaida; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}
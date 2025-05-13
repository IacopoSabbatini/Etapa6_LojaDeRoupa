package DAOs;

import Connection.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import roupas.Informacao;
import Repository.InformacaoRepository;


public class InformacaoDAO implements InformacaoRepository {
    @Override
    public void inserir(Informacao informacao) throws SQLException {
        String sql = "INSERT INTO informacao (nomeDaEmpresa, cnpj, endereco, contato, campoDeObservacao) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, informacao.getNomeDaEmpresa());
            stmt.setString(2, informacao.getCnpj());
            stmt.setString(3, informacao.getEndereco());
            stmt.setString(4, informacao.getContato());
            stmt.setString(5, informacao.getCampoDeObservacao());
            stmt.executeUpdate();
        }
    }

    @Override
    public List<Informacao> listar() throws SQLException {
        List<Informacao> informacoes = new ArrayList<>();
        String sql = "SELECT * FROM informacao";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Informacao informacao = new Informacao();
                informacao.setId(rs.getInt("id"));
                informacao.setNomeDaEmpresa(rs.getString("nome_da_empresa")); // Corrigido para corresponder ao nome da coluna no BD, se necessário
                informacao.setCnpj(rs.getString("cnpj"));
                informacao.setEndereco(rs.getString("endereco"));
                informacao.setContato(rs.getString("contato"));
                informacao.setCampoDeObservacao(rs.getString("campo_de_observacao")); // Corrigido para corresponder ao nome da coluna no BD, se necessário
                informacoes.add(informacao);
            }
        }
        return informacoes;
    }

    @Override
    public Informacao buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM informacao WHERE id = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Informacao informacao = new Informacao();
                    informacao.setId(rs.getInt("id"));
                    informacao.setNomeDaEmpresa(rs.getString("nome_da_empresa"));
                    informacao.setCnpj(rs.getString("cnpj"));
                    informacao.setEndereco(rs.getString("endereco"));
                    informacao.setContato(rs.getString("contato"));
                    informacao.setCampoDeObservacao(rs.getString("campo_de_observacao"));
                    return informacao;
                }
            }
        }
        return null; // Retorna null se não encontrar
    }
}


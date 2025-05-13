package DAOs;



import Connection.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Repository.CaixaRepository;
import roupas.Caixa;

public class CaixaDAO implements CaixaRepository {
    @Override
    public void inserir(Caixa caixa) throws SQLException {
        String sql = "INSERT INTO caixa (descricao, entrada_ou_saida, data, saldo) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, caixa.getDescricao());
            stmt.setString(2, caixa.getEntradaOuSaida());
            stmt.setDate(3, new java.sql.Date(caixa.getData().getTime())); // Certifique-se de que caixa.getData() retorna java.util.Date
            stmt.setDouble(4, caixa.getSaldo());
            stmt.executeUpdate();
        }
    }

    @Override
    public List<Caixa> listar() throws SQLException {
        List<Caixa> caixas = new ArrayList<>();
        String sql = "SELECT * FROM caixa";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Caixa caixa = new Caixa();
                caixa.setId(rs.getInt("id"));
                caixa.setDescricao(rs.getString("descricao"));
                caixa.setEntradaOuSaida(rs.getString("entrada_ou_saida"));
                caixa.setData(rs.getDate("data"));
                caixa.setSaldo(rs.getDouble("saldo"));
                caixas.add(caixa);
            }
        }
        return caixas;
    }

    @Override
    public Caixa buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM caixa WHERE id = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Caixa caixa = new Caixa();
                    caixa.setId(rs.getInt("id"));
                    caixa.setDescricao(rs.getString("descricao"));
                    caixa.setEntradaOuSaida(rs.getString("entrada_ou_saida"));
                    caixa.setData(rs.getDate("data"));
                    caixa.setSaldo(rs.getDouble("saldo"));
                    return caixa;
                }
            }
        }
        return null; // Retorna null se não encontrar
    }
}


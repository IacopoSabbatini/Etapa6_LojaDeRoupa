package Repository;


import java.sql.SQLException;
import java.util.List;
import DAOs.CaixaDAO;
import roupas.Caixa;

public interface CaixaRepository {
    void inserir(Caixa caixa) throws SQLException;
    List<Caixa> listar() throws SQLException;
    Caixa buscarPorId(int id) throws SQLException; // Supondo que exista uma busca por ID, ou outro método relevante
    // Outros métodos CRUD conforme necessário (atualizar, deletar)
}


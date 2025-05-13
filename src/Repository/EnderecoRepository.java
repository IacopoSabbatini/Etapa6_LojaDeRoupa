package Repository;

import java.sql.SQLException;
import java.util.List;
import roupas.Endereco;

public interface EnderecoRepository {
    void inserir(Endereco endereco) throws SQLException;
    List<Endereco> listar() throws SQLException;
    Endereco buscarPorId(int id) throws SQLException; // Supondo que a busca por ID seja útil
    // Outros métodos CRUD conforme necessário
}


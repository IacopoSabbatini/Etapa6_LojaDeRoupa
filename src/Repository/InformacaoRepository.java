package Repository;

import java.sql.SQLException;
import java.util.List;
import roupas.Informacao;

public interface InformacaoRepository {
    void inserir(Informacao informacao) throws SQLException;
    List<Informacao> listar() throws SQLException;
    Informacao buscarPorId(int id) throws SQLException; // Supondo que a busca por ID seja útil
    // Outros métodos CRUD conforme necessário
}


package Repository;

import java.sql.SQLException;
import java.util.List;
import roupas.User;
import DAOs.UserDAO;

public interface UserRepository {
    void inserir(User user) throws SQLException;
    List<User> listar() throws SQLException;
    User buscarPorEmail(String email) throws SQLException;
    // Futuramente, poderíamos adicionar métodos como atualizar(User user) e deletar(int id)
}


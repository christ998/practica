package practica.modelo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import practica.modelo.User;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UsuarioDAO extends CrudRepository<User,Long> {
    User findByEmailAndClave(String email, String clave);
    User findByEmail(String s);
}

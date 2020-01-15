package practica.modelo.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import practica.modelo.Dato;

public interface DatosDAO extends MongoRepository<Dato, String> {
}

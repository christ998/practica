package practica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import practica.modelo.DAO.UsuarioDAO;
import practica.modelo.User;

@Component
public class CargaInicial {

    @Autowired
    UsuarioDAO usuarioDAO;

    @EventListener(ApplicationReadyEvent.class)
    public void demo(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setEmail("admin@netapr.cl");
        user.setClave(bCryptPasswordEncoder.encode("1234"));
        usuarioDAO.save(user);
    }
}

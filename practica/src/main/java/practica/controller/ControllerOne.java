package practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica.modelo.DAO.DatosDAO;
import practica.modelo.Dato;

import java.util.List;


@Controller
public class ControllerOne {

    @Autowired
    private DatosDAO datosDAO;

    @GetMapping("/")
    public String index() {
        return "inicioweb";
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        List<Dato> datos = datosDAO.findAll();
        model.addAttribute("dato", datos);
        return "administrador";
    }

    @GetMapping
    public String caudal() {
        return "#";
    }
}

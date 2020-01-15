package practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica.modelo.DAO.DatosDAO;


@Controller
public class ControllerOne {

	@Autowired
	private DatosDAO datosDAO;
	@GetMapping("/")
	public String index() {
		return "inicioweb";
	}

        @GetMapping("/login")
        public String login(){

		return "login";
        }
        @GetMapping("/inicio")
        public String inicio(Model model){
		return "administrador";
	    }
	    @GetMapping("/admin")
		public String admin(){

		return "administrador";
		}

		@GetMapping
		public String caudal(){
			return "#";
		}
}

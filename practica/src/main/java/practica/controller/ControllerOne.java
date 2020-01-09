package practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import practica.modelo.User;

@Controller
public class ControllerOne {

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
	        model.addAttribute("ej",3);
	        return "administrador";
	    }
	    @GetMapping("/admin")
		public String admin(){
			return "administrador";
		}
}

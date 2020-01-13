package practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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

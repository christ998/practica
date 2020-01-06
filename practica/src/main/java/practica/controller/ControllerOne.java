package practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerOne {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
        
        @GetMapping("/index")
        public String menu(){
            return "login";
        }
        @GetMapping("/login")
        public String login(){
	        return "inicio";
        }
        @GetMapping("/inicio")
        public String inicio(Model model){
	        model.addAttribute("ej",3);
	        return "administrador";
	    }

}

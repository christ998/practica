package practica.controller;

import org.springframework.stereotype.Controller;
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

}

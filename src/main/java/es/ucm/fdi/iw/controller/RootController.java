package es.ucm.fdi.iw.controller;

import java.security.Principal;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller	
public class RootController {

	private static Logger log = Logger.getLogger(RootController.class);
	
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("s", "/static");
    }

	@GetMapping({"/", "/index"})
	public String root(Model model, Principal principal) {
		log.info(principal.getName() + " de tipo " + principal.getClass());		
		// org.springframework.security.core.userdetails.User
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	@GetMapping("/upload")
	public String upload() {
		return "upload";
	}
		
	@GetMapping("/quest")
	public String quest() {
		return "quest";
	}
	@GetMapping("/matches")
	public String matches() {
		return "matches";
	}
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	@GetMapping("/hacer_quest")
	public String hacer_quest() {
		return "hacer_quest";
	}
	@GetMapping("/match")
	public String match() {
		return "match";
	}
	@GetMapping("/reportes")
	public String reportes() {
		return "reportes";
  }
	@GetMapping("/messages") 
	public String messages(){
		return "messages";
	}
	@GetMapping("/editores") 
	public String editores(){
		return "editores";
	}
	@GetMapping("/registro") 
	public String registro(){
		return "registro";
	}
	@GetMapping("/quest_admin") 
	public String quest_admin(){
		return "quest_admin";
	}
	
}

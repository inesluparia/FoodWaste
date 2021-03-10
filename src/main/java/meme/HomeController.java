package meme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

@GetMapping
    public String index(){ return "index.html";}

@GetMapping("/about-us")
    public String aboutUs(){ return "about-us.html"; }

@GetMapping("/find-food")
    public String findFood(){ return "find-food.html"; }

@GetMapping("/log-in")
public String logIn(){ return "log-in.html"; }

@GetMapping("/logged-in")
    public String loggedIn(){
        return "logged-in.html";
    }
}

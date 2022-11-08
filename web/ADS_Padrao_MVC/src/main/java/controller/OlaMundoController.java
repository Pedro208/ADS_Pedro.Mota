package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {

    @GetMapping("/Ola")
    public String getOla(){
        return "Olá mundo";
    }
}

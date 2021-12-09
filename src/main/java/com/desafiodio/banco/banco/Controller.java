package com.desafiodio.banco.banco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String mensagem (){
        return "Mostrando na tela uma mensagem inicial";
    }

}

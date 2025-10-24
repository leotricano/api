package br.senac.rj.api.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public String olaMundo(){

        return "Hello World!";
    }

    @GetMapping("/voce/{nome}")
    public String olaVoce(@PathVariable String nome){

        if(nome != null){
            nome.concat(".");

        }else{
            nome = "Não recebi nome";
        }

        return "Hello, " + nome + " ! ";
    }

}

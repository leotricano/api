package br.senac.rj.api.controller;

import br.senac.rj.api.model.Livro;
import br.senac.rj.api.service.LivroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }
@GetMapping("/livros")
    public List<Livro> listarLivros(){

        return this.livroService.listarLivros();
    }
}

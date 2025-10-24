package br.senac.rj.api.service;


import br.senac.rj.api.model.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {


    public LivroService(){

    }

    public List<Livro> listarLivros(){
        List<Livro> livros = new ArrayList<>();
        for (int i=0; i<10; i++){
            Livro livro = new Livro();
            livro.setCodigo(Long.valueOf(i+1));
            livro.setTitulo("Titulo " + (i+1));
            livro.setPreco(Double.valueOf(100 + (i+1)));

            livros.add(livro);
        }
        return livros;
    }
}

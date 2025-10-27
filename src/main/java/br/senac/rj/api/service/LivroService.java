package br.senac.rj.api.service;


import br.senac.rj.api.model.Livro;
import br.senac.rj.api.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;

    }

    public List<Livro> listarLivros(){

        return this.livroRepository.findAll();
    }
public Livro incluirLivro(Livro livro){
        return livroRepository.save(livro);

}
    public Optional<Livro> buscarLivroPorCodigo(Long codigo){

        return this.livroRepository.findById(codigo);
    }
    public void excluirLivro(Long codigo){
        this.livroRepository.deleteById(codigo);

    }
    public void excluirLivroAll(){
        this.livroRepository.deleteAll();

    }
    public  Livro atualizarLivro(Long codigo, Livro livroAtualizado){

        Optional<Livro> livro = this.livroRepository.findById(codigo);
        Livro livroAjustado = livro.get();
        livroAjustado.setTitulo(livroAtualizado.getTitulo());
        livroAjustado.setPreco(livroAtualizado.getPreco());



        return this.livroRepository.save(livroAjustado);

    }
}

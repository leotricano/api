package br.senac.rj.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long codigo;
    @Getter
    @Setter
    private String titulo;
    @Getter
    @Setter
    private  Double preco;

    public Livro(String titulo , Double preco) {

        this.titulo = titulo;
        this.preco = preco;
    }
public Livro(){

}

}

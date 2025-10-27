package br.senac.rj.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long codigo;

    private String titulo;

    private  Double preco;

    public Livro(String titulo , Double preco) {

        this.titulo = titulo;
        this.preco = preco;
    }
public Livro(){

}

    public Long getCodigo() {
        return codigo;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

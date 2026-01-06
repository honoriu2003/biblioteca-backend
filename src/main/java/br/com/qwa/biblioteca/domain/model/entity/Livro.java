package br.com.qwa.biblioteca.domain.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro {
	
	@Id
	@Column(name = "COD_LIVRO", nullable = false)
	private Long id;
	
	@Column(name = "NOME_LIVRO", nullable = false)
	private String nomeLivro;
	
	@Column(name = "CATEGORIA_LIVRO", nullable = false)
	private List<Categoria> categoria;
	
	@Column(name = "AVALIACAO_LIVRO", nullable = false)
	private List<Avaliacao> avaliacao;
}

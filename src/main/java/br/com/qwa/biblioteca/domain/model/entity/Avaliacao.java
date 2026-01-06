package br.com.qwa.biblioteca.domain.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Avaliacao {
	
	@Id
	@Column(name = "COD_AVALIACAO", nullable = false)
	private Long id;
	
	@Column(name = "USUARIO_AVALIACAO", nullable = false)
	private Usuario usuario;
	
	@Column(name = "NOTA_AVALIACAO", nullable = false)
	private Integer nota;
	
	@Column(name = "COMENTARIO_AVALIACAO", nullable = false)
	private String comentario;
}

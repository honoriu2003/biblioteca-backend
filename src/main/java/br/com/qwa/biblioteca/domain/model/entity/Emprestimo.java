package br.com.qwa.biblioteca.domain.model.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emprestimo {
	
	@Id
	@Column(name = "COD_EMPRESTIMO", nullable = false)
	private Long id;
	
	@Column(name = "LIVRO", nullable = false)
	private Livro livro;
	
	@Column(name = "INICIO_EMPRESTIMO", nullable = false)
	@CreationTimestamp
	private LocalDate inicioEmprestimo;
	
	@Column(name = "FIM_EMPRESTIMO", nullable = false)
	private LocalDate fimEmprestimo;
}

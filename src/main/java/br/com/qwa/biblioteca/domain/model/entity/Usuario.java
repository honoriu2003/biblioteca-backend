package br.com.qwa.biblioteca.domain.model.entity;

import java.util.List;

import br.com.qwa.biblioteca.domain.model.enums.TipoUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "USUARIOS")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class Usuario {
	
	@Id
	@Column(name = "COD_USUARIO", nullable = false)
	private Long id;
	
	@Column(name = "NOME_USUARIO", nullable = false)
	private String nome;
	
	@Column(name = "EMAIL_USUARIO", nullable = false)
	private String email;
	
	@Column(name = "TIPO_USUARIO", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;
	
	@Column(name = "EMPRESTIMO_USUARIO", nullable = false)
	private List<Emprestimo> emprestimo;
}

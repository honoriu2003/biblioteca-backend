package br.com.qwa.biblioteca.domain.model.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoUsuario {

	ADMIN(1, "Admin"), 
	COLABORADOR(2, "Colaborador");

	private Integer codigo;
	private String descricao;
}

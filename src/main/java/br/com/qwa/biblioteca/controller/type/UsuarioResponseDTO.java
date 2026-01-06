package br.com.qwa.biblioteca.controller.type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {
	private String nomeUsuario;
	private Integer qtdEmprestados;
	private Integer qtdDoados;
	private Integer qtdAvaliados;
}

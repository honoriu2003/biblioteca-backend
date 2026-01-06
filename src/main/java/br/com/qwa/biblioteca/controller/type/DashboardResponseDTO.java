package br.com.qwa.biblioteca.controller.type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DashboardResponseDTO {
	private Integer qtdEmprestados;
	private Integer qtdDisponiveis;
}

package br.com.qwa.biblioteca.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoCategoria {

	LINGUAGEM_PROGRAMACAO(1, "Linguagens de Programação"), 
	BANCO_DE_DADOS_E_SQL(2, "Banco de Dados & SQL"),
	DESENVOLVIMENTO_WEB(3, "Desenvolvimento Web"),
	INFRAESTRUTURA_E_DEVOPS(4, "Infraestrutura & DevOps"),
	SEGURANCA_DA_INFORMACAO(5, "Segurança da Informação"),
	QUALIDADE_E_TESTES(6,"Qualidade & Testes"),
	ARQUITETURA_E_ENGENHARIA_DE_SOFTWARE(7, "Arquitetura & Engenharia de Software"),
	METODOLOGIAS(8, "Metodologias");
	

	private Integer codigo;
	private String descricao;
}

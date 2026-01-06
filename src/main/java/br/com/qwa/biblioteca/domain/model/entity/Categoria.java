package br.com.qwa.biblioteca.domain.model.entity;

import br.com.qwa.biblioteca.domain.model.enums.TipoCategoria;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Categoria {
	
	@Id
	@Column(name = "COD_CATEGORIA", nullable = false)
	private Long id;
	
	@Column(name = "TIPO_CATEGORIA", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoCategoria tipoCategoria;
}

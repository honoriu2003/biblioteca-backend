package br.com.qwa.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qwa.biblioteca.domain.model.entity.EmprestimoResponseDTO;
import br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.service.EmprestimoService;

@RestController
@RequestMapping("/v1/emprestimo")
public class EmprestimoController {

	@Autowired
	private EmprestimoService emprestimoService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public EmprestimoResponseDTO obterLivrosPorFiltro() {
		return this.emprestimoService.buscarLivrosPorFiltro();
	}
}

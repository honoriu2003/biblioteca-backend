package br.com.qwa.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qwa.biblioteca.controller.type.DashboardResponseDTO;
import br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.service.DashboardService;

@RestController
@RequestMapping("/v1/dashboard")
public class DashBoardController {

	@Autowired
	private DashboardService dashboardService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public DashboardResponseDTO obterTotalLivrosUsuario() {
		return this.dashboardService.buscarTotalLivrosUsuario();
	}
}

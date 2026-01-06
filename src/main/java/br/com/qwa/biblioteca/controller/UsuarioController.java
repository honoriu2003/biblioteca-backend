package br.com.qwa.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qwa.biblioteca.controller.type.UsuarioResponseDTO;
import br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.service.UsuarioService;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {
	
	@Autowired private UsuarioService usuarioService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public UsuarioResponseDTO obterUsuarios() {
		return this.usuarioService.buscarUsuario();
	}
}

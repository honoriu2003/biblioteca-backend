package br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qwa.biblioteca.controller.type.UsuarioResponseDTO;
import br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.servicebr.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired private UsuarioRepository usuarioRepository;
	
	public UsuarioResponseDTO buscarUsuario() {
		return null;
	}
}

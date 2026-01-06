package br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qwa.biblioteca.controller.type.DashboardResponseDTO;
import br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.servicebr.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.repository.LivroRepository;

@Service
public class DashboardService {

	@Autowired private LivroRepository livroRepository;
	
	public DashboardResponseDTO buscarTotalLivrosUsuario() {
		return null;
	}
}

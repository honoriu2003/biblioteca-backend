package br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qwa.biblioteca.domain.model.entity.EmprestimoResponseDTO;
import br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.servicebr.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.repository.EmprestimoRepository;

@Service
public class EmprestimoService {
	
	@Autowired private EmprestimoRepository emprestimoRepository;
	
	public EmprestimoResponseDTO buscarLivrosPorFiltro() {
		return null;
	}
}

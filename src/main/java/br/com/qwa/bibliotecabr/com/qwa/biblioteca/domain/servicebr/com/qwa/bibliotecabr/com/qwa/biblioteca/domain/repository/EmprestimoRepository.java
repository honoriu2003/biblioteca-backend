package br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.servicebr.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qwa.biblioteca.domain.model.entity.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}

package br.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.servicebr.com.qwa.bibliotecabr.com.qwa.biblioteca.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qwa.biblioteca.domain.model.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

package br.com.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springbackend.model.Livro;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Long> {
    
}

package br.com.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}

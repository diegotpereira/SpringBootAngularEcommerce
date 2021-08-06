package br.com.springbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.springbackend.model.User;
import br.com.springbackend.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {
    
    @Autowired
    private UserRepository repo;

    @GetMapping("/get")
    public List<User> getUsers() {
        return repo.findAll();
    }
}

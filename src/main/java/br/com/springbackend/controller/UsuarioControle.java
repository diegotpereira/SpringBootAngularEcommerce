package br.com.springbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.springbackend.model.Usuario;
import br.com.springbackend.repository.UsuarioRepositorio;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "usuarios")
public class UsuarioControle {
    
    @Autowired
    private UsuarioRepositorio repo;

    @GetMapping("/get")
    public List<Usuario> getUsers() {
        return repo.findAll();
    }

    @PostMapping("/add")
    public void criarUsuario(@RequestBody Usuario usuario) {
        repo.save(usuario);
    }

    @DeleteMapping(path = { "/{id}" })
    public Usuario deletarUsuario(@PathVariable("id") long id){
        Usuario usuario = repo.getById(id);
        repo.deleteById(id);
        return usuario;
    }
}

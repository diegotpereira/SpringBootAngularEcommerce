package br.com.springbackend.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import br.com.springbackend.model.Livro;
import br.com.springbackend.repository.LivroRepositorio;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "livros")
public class LivroControle {

    private byte[] bytes;
    
    @Autowired
    private LivroRepositorio repo;

    @GetMapping("/get")
    public List<Livro> getLivros() {
        return repo.findAll();
    }

    @PostMapping("/upload")
    public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        this.bytes = file.getBytes();
    }

    @PostMapping("/add")
    public void criarLivro(@RequestBody Livro livro) throws IOException {
        livro.setPicByte(this.bytes);
        repo.save(livro);
        this.bytes = null;
    }
}

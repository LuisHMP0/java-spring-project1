package com.example.cRuD.services;

import com.example.cRuD.model.Genero;
import com.example.cRuD.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/api/generos")
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping("/{id}")
    public Genero getGenero(@PathVariable Long id) {
        return generoRepository.findById(id).orElse(null);
    }

    @PostMapping("/adicionar")
    public Genero adicionarGenero(@RequestBody Genero genero) {
        return generoRepository.save(genero);
    }

    @PutMapping("/{id}")
    public Genero atualizarGenero(@PathVariable Long id, @RequestBody Genero generoAtualizado) {
        generoAtualizado.setId(id);
        return generoRepository.save(generoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void excluirGenero(@PathVariable Long id) {
        generoRepository.deleteById(id);
    }

    @GetMapping("/todos")
    public List<Genero> listarTodosGeneros() {
        return generoRepository.findAll();
    }
}

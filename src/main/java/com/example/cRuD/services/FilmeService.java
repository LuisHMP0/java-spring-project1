package com.example.cRuD.services;

import com.example.cRuD.model.Filme;
import com.example.cRuD.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/api/filmes")
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;
    @GetMapping("/rambo")
    public String filmeRambo () {
        return "RAMBO " +
                "(Um veterano de guerra problemático e incompreendido fica do lado errado de um cruel xerife " +
                "de uma pequena cidade. Infelizmente, isso resulta em uma caçada humana que o obriga a lutar " +
                "pela sua sobrevivência.)";
    }
    @GetMapping("/rambo2")
    public String Rambo2 () {
        return "RAMBO 2 (John Rambo tem a oportunidade de encurtar seu mandato na prisão, partindo em uma missão " +
                "secreta para o governo dos EUA nas profundezas das selvas do Vietnã e localizando prisioneiros " +
                "de guerra americanos.)";
    }

    @PostMapping("/adicionar")
    public Filme adicionarFilme(@RequestBody Filme filme) {
        return filmeRepository.save(filme);
    }
    @PutMapping("/{id}")
    public Filme atualizarFilme(@PathVariable Long id, @RequestBody Filme filmeAtualizado) {
        filmeAtualizado.setId(id);
        return filmeRepository.save(filmeAtualizado);
    }

    @DeleteMapping("/{id}")
    public void excluirFilme(@PathVariable Long id) {
        filmeRepository.deleteById(id);
    }

    @GetMapping("/todos")
    public List<Filme> listarTodosFilmes() {
        return filmeRepository.findAll();
    }

}

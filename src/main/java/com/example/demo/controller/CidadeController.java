package com.example.demo.controller;

import com.example.demo.model.Cidade;
import com.example.demo.repository.CidadeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    private final CidadeRepository repository;

    public CidadeController(CidadeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cidade> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Cidade salvar(@RequestBody Cidade cidade) {
        return repository.save(cidade);
    }
}
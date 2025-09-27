package com.example.crud_biblioteca.controller;

import com.example.crud_biblioteca.model.Livro;
import com.example.crud_biblioteca.repository.LivroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    // LISTAR TODOS
    @GetMapping
    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
        return livroRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // SALVAR
    @PostMapping
    public Livro salvar(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    // ATUALIZAR
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable Long id, @RequestBody Livro livroDetalhes) {
        return livroRepository.findById(id)
                .map(l -> {
                    l.setTitulo(livroDetalhes.getTitulo());
                    l.setAutor(livroDetalhes.getAutor());
                    l.setAno(livroDetalhes.getAno());
                    Livro atualizado = livroRepository.save(l);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return livroRepository.findById(id)
                .map(l -> {
                    livroRepository.delete(l);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

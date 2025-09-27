package com.example.crud_biblioteca.repository;

import com.example.crud_biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  LivroRepository extends JpaRepository<Livro,Long> {
}

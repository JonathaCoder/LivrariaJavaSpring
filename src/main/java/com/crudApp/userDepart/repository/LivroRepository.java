package com.crudApp.userDepart.repository;

import com.crudApp.userDepart.entidy.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {
}

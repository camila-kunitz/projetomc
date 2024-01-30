package com.camilakunitz.projetomc.repositories;

import com.camilakunitz.projetomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {}

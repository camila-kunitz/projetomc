package com.camilakunitz.projetomc.repositories;

import com.camilakunitz.projetomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {}

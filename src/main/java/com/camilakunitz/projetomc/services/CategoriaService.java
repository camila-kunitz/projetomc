package com.camilakunitz.projetomc.services;

import com.camilakunitz.projetomc.domain.Categoria;
import com.camilakunitz.projetomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;
    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }

}

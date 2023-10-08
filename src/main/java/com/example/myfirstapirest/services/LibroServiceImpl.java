package com.example.myfirstapirest.services;

import com.example.myfirstapirest.entities.Libro;
import com.example.myfirstapirest.repositories.BaseRepository;
import com.example.myfirstapirest.repositories.LibroRepository;
import com.example.myfirstapirest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{


    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Libro> findAll() throws Exception {
        return null;
    }
}

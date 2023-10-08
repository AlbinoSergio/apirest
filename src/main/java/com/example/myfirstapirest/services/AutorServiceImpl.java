package com.example.myfirstapirest.services;

import com.example.myfirstapirest.entities.Autor;
import com.example.myfirstapirest.repositories.AutorRepository;
import com.example.myfirstapirest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
    @Override
    public List<Autor> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Autor> findALL() throws Exception {
        return null;
    }
}

package com.example.myfirstapirest.services;

import com.example.myfirstapirest.entities.Localidad;
import com.example.myfirstapirest.repositories.BaseRepository;
import com.example.myfirstapirest.repositories.LocalidadRepository;
import com.example.myfirstapirest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long>implements LocalidadService{


    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }

    @Override
    public List<Localidad> findAll() throws Exception {
        return null;
    }
}

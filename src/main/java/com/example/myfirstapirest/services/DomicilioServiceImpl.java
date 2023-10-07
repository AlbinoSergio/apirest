package com.example.myfirstapirest.services;

import com.example.myfirstapirest.entities.Domicilio;
import com.example.myfirstapirest.repositories.BaseRepository;
import com.example.myfirstapirest.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{


    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Domicilio> findAll() throws Exception {
        return null;
    }
}
package com.example.myfirstapirest.services;

import com.example.myfirstapirest.entities.Domicilio;
import com.example.myfirstapirest.repositories.BaseRepository;
import com.example.myfirstapirest.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{


    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Domicilio> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Domicilio> findALL() throws Exception {
        return null;
    }
}

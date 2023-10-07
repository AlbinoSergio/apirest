package com.example.myfirstapirest.repositories;

import com.example.myfirstapirest.entities.Autor;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {

}

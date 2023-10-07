package com.example.myfirstapirest.repositories;

import com.example.myfirstapirest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {

}

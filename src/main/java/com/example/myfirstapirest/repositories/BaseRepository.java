package com.example.myfirstapirest.repositories;

import com.example.myfirstapirest.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean

public interface BaseRepository <E extends Base,Id extends Serializable> extends JpaRepository<E,Id> {

}

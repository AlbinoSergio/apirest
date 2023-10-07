package com.example.myfirstapirest.controllers;

import com.example.myfirstapirest.entities.Autor;
import com.example.myfirstapirest.entities.Localidad;
import com.example.myfirstapirest.services.AutorServiceImpl;
import com.example.myfirstapirest.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}

package com.example.myfirstapirest.controllers;

import com.example.myfirstapirest.entities.Autor;
import com.example.myfirstapirest.entities.Libro;
import com.example.myfirstapirest.services.AutorServiceImpl;
import com.example.myfirstapirest.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}

package com.delfinasilva.projecto_java.controller;

import com.delfinasilva.projecto_java.model.Projecto;
import com.delfinasilva.projecto_java.repository.ProjectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projectos")
public class ProjectoController {

    @Autowired
    private ProjectoRepository repository;

    @GetMapping
    public List<Projecto> listarTodos()
    {
        return repository.findAll();
    }

    @PostMapping
    public Projecto criar(@RequestBody Projecto projecto)
    {
        return repository.save(projecto);
    }
}

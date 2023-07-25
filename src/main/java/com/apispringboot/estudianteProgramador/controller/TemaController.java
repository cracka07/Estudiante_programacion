package com.apispringboot.estudianteProgramador.controller;

import com.apispringboot.estudianteProgramador.model.Tema;
import com.apispringboot.estudianteProgramador.service.ITemaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {

    @Autowired
    private ITemaService temaServ;

    @PostMapping("/temas/new")
    public String newTema(@RequestBody Tema tema) {
        temaServ.saveTema(tema);
        return "Tema creado exitosamente";
    }

    @GetMapping("/temas/get")
    public List<Tema> getTemas() {
        return this.temaServ.getTemas();
    }

    @PutMapping("/temas/edit")
    public String editTema(@RequestBody Tema tema) {
        this.temaServ.editTemas(tema);
        return "Tema Editado correctamente";
    }
}

package com.proyectotodo.spring_todo.controller;

import com.proyectotodo.spring_todo.entity.Usuario;
import com.proyectotodo.spring_todo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    @GetMapping("/Buscar")
    public List<Usuario> buscarTodos(){
        return  usuarioService.buscarTodos();
    }

    @PostMapping("/Guardar")
    public String guardar (@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }
}

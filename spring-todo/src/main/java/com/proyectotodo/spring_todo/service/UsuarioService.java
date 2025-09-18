package com.proyectotodo.spring_todo.service;

import com.proyectotodo.spring_todo.entity.Usuario;
import com.proyectotodo.spring_todo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public String guardar(Usuario usuario) {
        usuarioRepository.save(usuario);
        return  "Usuario Guardado Correctamente";
    }

    public List<Usuario> buscarTodos (){

        List<Usuario> listaUsuario = usuarioRepository.findAll();
        return listaUsuario;
    }

}

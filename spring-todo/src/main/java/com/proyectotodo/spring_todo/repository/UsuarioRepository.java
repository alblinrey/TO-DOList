package com.proyectotodo.spring_todo.repository;

import com.proyectotodo.spring_todo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}

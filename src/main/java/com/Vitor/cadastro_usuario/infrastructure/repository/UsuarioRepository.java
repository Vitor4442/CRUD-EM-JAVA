package com.Vitor.cadastro_usuario.infrastructure.repository;

import com.Vitor.cadastro_usuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //procurar email
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}

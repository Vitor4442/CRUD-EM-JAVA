package com.Vitor.cadastro_usuario.business;

import com.Vitor.cadastro_usuario.infrastructure.entitys.Usuario;
import com.Vitor.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    //metodo para salvar o usuario
    public void SalvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);
    }
}

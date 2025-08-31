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

    public Usuario BuscarUsuarioPorEmail(String email) {

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("email nao encontrado")
        );
    }

    public void deletarUsuarioPorEmail(String email) {
        repository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id).orElseThrow(()-> new RuntimeException("id nao encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();

        repository.save(usuarioAtualizado);
    }
}
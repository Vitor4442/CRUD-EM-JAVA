package com.Vitor.cadastro_usuario.controller;

import com.Vitor.cadastro_usuario.business.UsuarioService;
import com.Vitor.cadastro_usuario.infrastructure.entitys.Usuario;
import com.Vitor.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor

public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Usuario usuario) {
        usuarioService.SalvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.BuscarUsuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email) {
        usuarioService.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity <Void> atualizarUsuarioPorId(@RequestParam Integer id,
                                                       @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }
}
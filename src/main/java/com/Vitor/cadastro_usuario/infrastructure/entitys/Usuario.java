package com.Vitor.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {

    @id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
}

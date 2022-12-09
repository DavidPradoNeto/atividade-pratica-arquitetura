package com.example.backend.usuario;

import java.util.Date;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class Usuario {
    
    private String nome;
    private String apelido;
    private Date nascimento;
    private String endereco;
    private String municipio;
    private boolean ativo;

}

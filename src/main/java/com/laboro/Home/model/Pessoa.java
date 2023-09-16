package com.laboro.Home.model;

import javax.persistence.Entity;

@Entity
public class Pessoa {
    private Long id;
    private String nome;
    private String cpf;
    private char sexo;
    private String email;
    private Address endereco;
}

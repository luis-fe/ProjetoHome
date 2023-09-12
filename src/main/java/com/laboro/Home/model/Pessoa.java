package com.laboro.Home.model;

import javax.persistence.Entity;

@Entity
public class Pessoa {
    private Long id;
    private char[] nome = new char[64];
    private char[] cpf = new char[11];
    private char sexo;
    private String email;
    private Address endereco;
}

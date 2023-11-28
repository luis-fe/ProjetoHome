package com.laboro.Home.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "pessoa", uniqueConstraints = 
    @UniqueConstraint(columnNames = {"cpf", "email"}))
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("A")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private char sexo;
    private String email;

    @Embedded
    private Address endereco;
}

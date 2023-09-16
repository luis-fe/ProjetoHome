package com.laboro.Home.model;

import com.laboro.Home.model.enums.TipoUsuario;
import com.laboro.Home.model.enums.WorkCategory;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends Pessoa{
    private String senha;
    private String login;
    private TipoUsuario tipoUsuario;
    private List<WorkCategory> categoriasTrabalhos = new ArrayList<>();
}

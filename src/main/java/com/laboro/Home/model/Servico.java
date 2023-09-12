package com.laboro.Home.model;

import com.laboro.Home.model.enums.WorkCategory;

import java.util.List;


public class Servico {
    private String titulo;
    private String descricao;
    private WorkCategory tipoServico;
    private List<Tag> tags;
}

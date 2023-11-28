package com.laboro.Home.model;

import com.laboro.Home.model.enums.WorkCategory;
import lombok.Data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private WorkCategory tipoServico;
//    private List<Tag> tag;
}

package com.laboro.Home.model;

import com.laboro.Home.model.enums.TipoUsuario;
import com.laboro.Home.model.enums.WorkCategory;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@DiscriminatorValue("B")
public class Usuario extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String senha;
    private String login;


    @Enumerated(EnumType.STRING)
    private WorkCategory category;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

   // @ManyToOne
   // @JoinColumn(name = "codigo_categoria")
 //   private Categoria categoria;
    //private List<WorkCategory> categoriasTrabalhos = new ArrayList<>();
    private Boolean ativo;
}

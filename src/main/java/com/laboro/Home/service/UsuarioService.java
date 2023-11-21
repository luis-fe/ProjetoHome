package com.laboro.Home.service;

import com.laboro.Home.model.Usuario;
import com.laboro.Home.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario){ return  usuarioRepository.save(usuario);}

    public List<Usuario> buscarTodos(){ return usuarioRepository.findAll();}


}

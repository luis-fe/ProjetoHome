package com.laboro.Home.controller;

import com.laboro.Home.model.Usuario;
import com.laboro.Home.repository.UsuarioRepository;
import com.laboro.Home.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")
@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public ResponseEntity<Usuario> salvarCidade(@RequestBody Usuario usuario){

        Usuario response = usuarioService.salvar(usuario);
        return ResponseEntity.ok(response);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Usuario>> buscarTodos(){

        List<Usuario> response = usuarioService.buscarTodos();
        return ResponseEntity.ok(response);
    }


}

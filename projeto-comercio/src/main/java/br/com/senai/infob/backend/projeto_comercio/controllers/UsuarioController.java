package br.com.senai.infob.backend.projeto_comercio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.backend.projeto_comercio.models.Usuario;
import br.com.senai.infob.backend.projeto_comercio.services.UsuarioService;


@RestController
@RequestMapping("/usuario") 

public class UsuarioController {
    @Autowired 
    private UsuarioService usuarioService;
    
    @PostMapping("/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @PostMapping("/login")
    public String loginString(@RequestParam String email, @RequestParam String senha) {
    boolean logou = usuarioService.login(email,senha);
    if (logou) {
        return "Login feito com sucesso!";
    }
        return "login falhado";
    }
    
}
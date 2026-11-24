package br.com.senai.infob.backend.projeto_comercio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.backend.projeto_comercio.models.Usuario;
import br.com.senai.infob.backend.projeto_comercio.repositories.UsuarioRepository;

@Service 
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Long contar () {
        return usuarioRepository.count();
    }
     
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
}


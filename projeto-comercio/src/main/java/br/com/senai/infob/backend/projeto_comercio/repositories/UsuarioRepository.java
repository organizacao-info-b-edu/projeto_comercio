package br.com.senai.infob.backend.projeto_comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infob.backend.projeto_comercio.models.Usuario;

public interface  UsuarioRepository extends JpaRepository<Usuario,Integer>{
    
}

package br.com.senai.infob.backend.projeto_comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.senai.infob.backend.projeto_comercio.models.Usuario;
import java.util.List;


public interface  UsuarioRepository extends JpaRepository<Usuario,Integer>{
    
    @Query (value = "select * from usuario where email = :email", nativeQuery=true)
    Usuario findByEmail(String email);
}    

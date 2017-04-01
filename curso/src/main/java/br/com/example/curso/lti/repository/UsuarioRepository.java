package br.com.example.curso.lti.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.example.curso.lti.domain.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer> {

}

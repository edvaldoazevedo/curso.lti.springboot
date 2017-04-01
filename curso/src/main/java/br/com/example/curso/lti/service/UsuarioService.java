package br.com.example.curso.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.example.curso.lti.domain.Usuario;
import br.com.example.curso.lti.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuRepository;
	
	public void salvarUsuario(Usuario usu){
		usuRepository.save(usu);
	}
	public Usuario buscarUsuario(int id){
		Usuario usu = usuRepository.findOne(id);
		return usu;
		
	}
	public List<Usuario> buscarUsuarios(){
		return usuRepository.findAll();
		
	}
	
	public void atualizarUsuario(Usuario usu){
		usuRepository.save(usu);
	}
	public void removerUsuario(Usuario usuario){
		usuRepository.delete(usuario.getId());
	}

}

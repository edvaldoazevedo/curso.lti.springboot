package br.com.example.curso.lti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.curso.lti.domain.Usuario;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {
	
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> criarUsuario(@RequestBody Usuario usu){
		try {
			usuarios.add(usu);
			System.out.println(usu.getNome());
			
			return new ResponseEntity<String>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> buscarUsuarios(){
		
		return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Usuario>buscarUsuarioPorId(@PathVariable int id){
		
		Usuario usuario1 =  new Usuario();
		for (Usuario usuario : usuarios) {
			if(usuario.getId() == id){
				usuario1 = usuario;
			}
		}
		return new ResponseEntity<Usuario>(usuario1,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Usuario>removerUsuarioPorId(@PathVariable int id){
		
		Usuario usuario1 =  new Usuario();
		for (Usuario usuario : usuarios) {
			if(usuario.getId() == id){
				usuario1 = usuario;
				usuarios.remove(usuario);
			}
		}
		System.out.println("O usuário "+" "+usuario1.getNome()+" "+ "foi removido");
		return new ResponseEntity<Usuario>(usuario1,HttpStatus.OK);
	}
	
	
	
	

}

package br.com.example.curso.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.curso.lti.domain.Usuario;
import br.com.example.curso.lti.service.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> criarUsuario(@RequestBody Usuario usu){
		try {
			usuService.salvarUsuario(usu);
			return new ResponseEntity<String>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> buscarUsuarios(){
		
		List<Usuario> usuarios = usuService.buscarUsuarios();
		return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Usuario>buscarUsuarioPorId(@PathVariable int id){
		
		Usuario usuario=  usuService.buscarUsuario(id);
		return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<String>removerUsuarioPorId(@PathVariable Usuario usuario){
		
		try {
			usuService.removerUsuario(usuario);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	

}

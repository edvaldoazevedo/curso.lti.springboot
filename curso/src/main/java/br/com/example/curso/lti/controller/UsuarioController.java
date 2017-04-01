package br.com.example.curso.lti.controller;

import java.util.ArrayList;

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
	public String criarUsuario(@RequestBody Usuario usu){
		
		try {
			
			
			usuarios.add(usu);
			System.out.println(usu.getNome());
			
			return "Usuário" + ""+ usu.getNome() + ""+ "cadastrado";
		} catch (Exception e) {
			return "Erro";
		}
		
	}
	@RequestMapping(method=RequestMethod.GET)
	public ArrayList<Usuario> buscarUsuario(){
		
		return usuarios;
		
	}
	
	

}

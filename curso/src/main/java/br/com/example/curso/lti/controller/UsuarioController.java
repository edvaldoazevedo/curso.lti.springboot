package br.com.example.curso.lti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.curso.lti.domain.Usuario;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String buscarUsuario(){
		Usuario usu = new Usuario();
		usu.setNome("Edvaldo");
		usu.setCpf("123.456.789-01");
		
		return "Nome do usuário é :" + usu.getNome() +" "+ "CPF :"+ usu.getCpf();
	}

}

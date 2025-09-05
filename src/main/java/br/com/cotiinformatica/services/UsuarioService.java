package br.com.cotiinformatica.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.AutenticarUsuarioRequestDto;
import br.com.cotiinformatica.dtos.AutenticarUsuarioResponseDto;
import br.com.cotiinformatica.dtos.CriarUsuarioRequestDto;
import br.com.cotiinformatica.dtos.CriarUsuarioResponseDto;
import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.helpers.CryptoHelper;
import br.com.cotiinformatica.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	/*
	 * Serviço para criação de usuário
	 */
	public CriarUsuarioResponseDto criarUsuario(CriarUsuarioRequestDto request) {		

		//criando um objeto da classe Usuario
		var usuario = new Usuario();
		
		var crypto = new CryptoHelper();
		
		//Preenchendo os dados do usuário
		usuario.setNome(request.getNome());
		usuario.setEmail(request.getEmail());
		usuario.setSenha(crypto.getSha256(request.getSenha()));
		usuario.setDataHoraCriacao(LocalDateTime.now());
		
		//gravar o usuário no banco de dados
		usuarioRepository.save(usuario);
		
		//Retornar os dados da resposta
		var response = new CriarUsuarioResponseDto();
		response.setId(usuario.getId());
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setDataHoraCriacao(usuario.getDataHoraCriacao());
		
		return response;
	}
	
	/*
	 * Serviço para autenticação de usuário
	 */
	public AutenticarUsuarioResponseDto autenticarUsuario(AutenticarUsuarioRequestDto request) {
		//TODO Implementar
		return null;
	}
}

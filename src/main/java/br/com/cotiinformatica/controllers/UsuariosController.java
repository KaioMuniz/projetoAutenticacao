package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.AutenticarUsuarioRequestDto;
import br.com.cotiinformatica.dtos.CriarUsuarioRequestDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {

	@PostMapping("criar")
	public ResponseEntity<?> criar(@RequestBody @Valid CriarUsuarioRequestDto request) {
		// TODO implementar o serviço
		return ResponseEntity.ok().build();
	}

	@PostMapping("autenticar")
	public ResponseEntity<?> autenticar(@RequestBody @Valid AutenticarUsuarioRequestDto request) {
		// TODO implementar o serviço
		return ResponseEntity.ok().build();
	}
}

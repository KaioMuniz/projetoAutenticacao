package br.com.cotiinformatica.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CriarUsuarioResponseDto {

	private UUID id;
	private String nome;
	private String email;
	private LocalDateTime dataHoraCriacao;
	private String perfil;
}

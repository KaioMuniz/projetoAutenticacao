package br.com.cotiinformatica.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AutenticarUsuarioResponseDto {

	private UUID id;
	private String nome;
	private String email;
	private String accessToken;
	private LocalDateTime dataHoraAcesso;	
	private LocalDateTime dataHoraExpiracao;
}

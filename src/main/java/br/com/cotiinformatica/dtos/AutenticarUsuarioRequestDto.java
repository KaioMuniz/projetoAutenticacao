package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AutenticarUsuarioRequestDto {

	@Email(message = "O email de acesso deve ser um endereço de email válido.")
	@NotEmpty(message = "O email de acesso é obrigatório.")
	private String email;
	
	@Size(min = 8, message = "A senha de acesso deve ter pelo menos 8 caracteres.")
	@NotEmpty(message = "A senha de acesso é obrigatório.")
	private String senha;
}

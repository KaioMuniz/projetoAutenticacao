package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CriarUsuarioRequestDto {

	@Size(min = 6, max = 100, message = "O nome do usuário deve ter de 6 a 100 caracteres.")
	@Pattern(regexp = "^[A-Za-zÀ-Üà-ü\\s]{6,100}$", 
			message = "O nome só pode ter letras e espaços e deve conter de 6 a 100 caracteres.")
	@NotEmpty(message = "O nome do usuário é obrigatório.")
	private String nome;
	
	@Email(message = "O email deve conter um endereço válido.")
	@NotEmpty(message = "O email do usuário é obrigatório.")
	private String email;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", 
			message = "A senha deve ter pelo menos uma letra maiúscula, uma letra minúscula, um número e um símbolo especial e pelo menos 8 caracteres.")
	@NotEmpty(message = "A senha do usuário é obrigatório.")
	private String senha;
}

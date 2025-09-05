package br.com.cotiinformatica.configurations;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfiguration {

	 	@Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI()
	                // Informações da API
	                .info(new Info()
	                        .title("API Autenticação de Usuários")
	                        .version("1.0.0")
	                        .description("API REST para gerenciamento de usuários e permissões")
	                        .termsOfService("https://meusite.com/terms")
	                        .contact(new Contact()
	                                .name("Suporte Técnico")
	                                .email("suporte@autenticacao.com")
	                                .url("https://meusite.com/contact"))
	                        .license(new License()
	                                .name("Apache 2.0")
	                                .url("https://springdoc.org")))
	                
	                // Servidores
	                .servers(List.of(
	                        new Server()
	                                .url("http://localhost:8082")
	                                .description("Servidor de Desenvolvimento"),
	                        new Server()
	                                .url("https://api.autenticacao.com")
	                                .description("Servidor de Produção")
	                ))
	                
	                // Componentes (Schemas de segurança, etc)
	                .components(new Components()
	                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
	                                .type(SecurityScheme.Type.HTTP)
	                                .scheme("bearer")
	                                .bearerFormat("JWT")
	                                .description("Token JWT para autenticação")))
	                
	                // Segurança global (se aplicável)
	                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"));
	    }

}

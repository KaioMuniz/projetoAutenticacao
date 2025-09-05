package br.com.cotiinformatica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

	@Query("""
			SELECT u FROM Usuario u WHERE u.email = :email
			""")
	Usuario find(String email);
}
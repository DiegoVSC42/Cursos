package br.com.alura.codechella.infra.presistence;


import br.com.alura.codechella.domain.entities.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

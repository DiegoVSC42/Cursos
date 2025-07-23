package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario("123456789-99","Jacque", LocalDate.parse("1990-09-08"),"email@email.com"));
    }
    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario(){
        FabricaDeUsuario  fabrica = new FabricaDeUsuario();
        Usuario usuario =  fabrica.comNomeCpfNascimento("Emily","654.123.897-88", LocalDate.parse(("2000-10-01")));
        Assertions.assertEquals(usuario.getNome(), "Emily");
        usuario =  fabrica.incluiEndereco("12345-999",40,"apto 201");
        Assertions.assertEquals(usuario.getEndereco().getComplemento(), "apto 201");
    }
}
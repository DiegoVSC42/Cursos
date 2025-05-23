package diego.desafio.musicchallenge;

import diego.desafio.musicchallenge.principal.Principal;
import diego.desafio.musicchallenge.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicchallengeApplication implements CommandLineRunner {

	@Autowired
	private ArtistaRepository repositorio;
	public static void main(String[] args) {
		SpringApplication.run(MusicchallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}

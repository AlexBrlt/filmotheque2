package fr.eni.filmotheque.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.eni.filmotheque.FilmRepository;
import fr.eni.filmotheque.bo.Film;

@Configuration
public class FilmothequeConfig {

	@Bean
	public CommandLineRunner essai(FilmRepository repository) {
		return (args) -> {
			// ajouter des films
			repository.save(new Film("Sauvez Willy", 1995, 180));
			repository.save(new Film("Harry PotPot", 2000, 250));
			repository.save(new Film("Memoire d\'une geisha", 2005, 210));

			System.out.println("Liste de tous les films : ");
			repository.findAll().forEach(film-> System.out.println(film));
			
		};

	}

}

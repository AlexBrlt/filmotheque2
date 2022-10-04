package fr.eni.filmotheque.config;S

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.eni.filmotheque.FilmRepository;
import fr.eni.filmotheque.GenreRepository;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Genre;

@Configuration
public class FilmothequeConfig {
	
	@Bean
	public CommandLineRunner essai(FilmRepository repository, GenreRepository gRepository) {
		return (args) -> {
			// Ajouter des genres
			gRepository.save(new Genre(0, "comedie"));
			gRepository.save(new Genre(1, "science fiction"));
			// ajouter des films
			repository.save(new Film("Sauvez Willy", 1995, 180, comedie));
			repository.save(new Film("Harry PotPot", 2000, 250, "science fiction"));
			repository.save(new Film("Memoire d\'une geisha", 2005, 210, 0));

			System.out.println("Liste de tous les films : ");
			repository.findAll().forEach(film-> System.out.println(film));
			
		};

	}

}

package fr.eni.filmotheque;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotheque.bo.Film;

public interface FilmRepository extends JpaRepository<Film, Integer>{

}

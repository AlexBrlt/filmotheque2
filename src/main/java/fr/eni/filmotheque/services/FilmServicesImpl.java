package fr.eni.filmotheque.services;

import java.util.List;

import fr.eni.filmotheque.FilmRepository;
import fr.eni.filmotheque.GenreRepository;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.Participant;

public class FilmServicesImpl implements FilmsService {

	private FilmRepository repository;
	private GenreRepository gRepository;
	
	
	
	public FilmServicesImpl(FilmRepository repository, GenreRepository gRepository) {
		super();
		this.repository = repository;
		this.gRepository = gRepository;
	}

	@Override
	public List<Film> getAllFilms() {
		return repository.findAll();
	}

	@Override
	public Film getFilmById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Genre> getGenres() {
		// TODO Auto-generated method stub
		return gRepository.findAll();
	}

	@Override
	public List<Participant> getParticipants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genre getGenreById(int genreId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participant getParticipantById(int idParticipant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterFilm(Film film) {
		// TODO Auto-generated method stub
		
	}

}

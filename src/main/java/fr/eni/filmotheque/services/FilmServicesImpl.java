package fr.eni.filmotheque.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.AvisRepository;
import fr.eni.filmotheque.FilmRepository;
import fr.eni.filmotheque.GenreRepository;
import fr.eni.filmotheque.ParticipantRepository;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.Participant;

@Service
public class FilmServicesImpl implements FilmsService {

	private List<Film> films ;
	private FilmRepository repository;
	private GenreRepository gRepository;
	private ParticipantRepository pRepository;
	private AvisRepository aRepository;
	
	int compteurFilm = 2;
	
	
	
	public FilmServicesImpl(FilmRepository repository, GenreRepository gRepository, ParticipantRepository pRepository, AvisRepository aRepository) {
		super();
		this.repository = repository;
		this.gRepository = gRepository;
		this.pRepository = pRepository;
		this.aRepository = aRepository;
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
		return pRepository.findAll();
	}

	@Override
	public Genre getGenreById(int id) {
		// TODO Auto-generated method stub
		return gRepository.findById(id).get();
	}

	@Override
	public Participant getParticipantById(int id) {
		// TODO Auto-generated method stub
		return pRepository.findById(id).get();
	}

	@Override
	public void ajouterFilm(Film film) {
		film.setId(compteurFilm++);
		films.add(film);
		
	}

}

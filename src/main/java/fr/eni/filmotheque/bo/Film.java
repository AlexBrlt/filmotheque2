package fr.eni.filmotheque.bo;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "FILMS")
public class Film {

	@Id
	@GeneratedValue
    private Integer id;

    @NotNull
    @NotBlank
    private String titre;

    @Transient
    private int anneeSortie;
    @Transient
    private int duree;
    
    @Size(min = 20, max = 250)
    @Transient
    private String synopsis;

    @Transient
    private Participant realisateur;
    @Transient
    private List<Participant> acteurs;
    
    private ArrayList<Genre> genre;
    @Transient
    private List<Avis> avis;


    public Film(Integer id, String titre, int anneeSortie, Participant realisateur, 
    		int duree, Genre genre, String synopsis) {
		this();
		this.id = id;
		this.titre = titre;
		this.anneeSortie = anneeSortie;
		this.realisateur = realisateur;
		this.duree = duree;
		this.genre = new ArrayList<Genre>();;
		this.acteurs = new ArrayList<Participant>();
		this.avis = new ArrayList<Avis>();
		this.synopsis = synopsis;
	}

	public Film() {
		this.acteurs = new ArrayList<>();
    }
	
	
	public Film(@NotNull @NotBlank String titre, int anneeSortie, int duree, Genre genre) {
		super();
		this.titre = titre;
		this.anneeSortie = anneeSortie;
		this.duree = duree;
		this.genre = new ArrayList<Genre>();
	}

	public void addActeur(Participant acteur) {
    	this.acteurs.add(acteur);
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public Participant getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Participant realisateur) {
        this.realisateur = realisateur;
    }

    public List<Participant> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Participant> acteurs) {
        this.acteurs = acteurs;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = (ArrayList<Genre>) genre;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", anneeSortie=" + anneeSortie + ", duree=" + duree
				+ ", synopsis=" + synopsis + ", realisateur=" + realisateur + ", genre=" + genre + "]";
	}
}

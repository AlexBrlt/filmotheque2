package fr.eni.filmotheque;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotheque.bo.Avis;

public interface AvisRepository extends JpaRepository<Avis, String>{
	
}

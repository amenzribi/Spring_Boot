package espritSpring.tn.seance1.Repository;

import espritSpring.tn.seance1.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {

Skieur findBynumSkieur(Long numSkieur);
}

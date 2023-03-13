package espritSpring.tn.seance1.Repository;

import espritSpring.tn.seance1.Entities.Cours;
import espritSpring.tn.seance1.Entities.Moniteur;
import espritSpring.tn.seance1.Entities.Piste;
import espritSpring.tn.seance1.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PisteRepository extends JpaRepository<Piste, Long> {

    Piste findBynumPiste(Long numPiste);



}

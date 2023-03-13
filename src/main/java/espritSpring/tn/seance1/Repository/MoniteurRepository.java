package espritSpring.tn.seance1.Repository;

import espritSpring.tn.seance1.Entities.Moniteur;
import espritSpring.tn.seance1.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {


}

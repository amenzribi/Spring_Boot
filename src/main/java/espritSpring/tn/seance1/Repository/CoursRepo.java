package espritSpring.tn.seance1.Repository;

import espritSpring.tn.seance1.Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepo extends JpaRepository<Cours,Long> {
    Cours findByNumCours(Long numCours);
}

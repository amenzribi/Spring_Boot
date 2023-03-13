package espritSpring.tn.seance1.Repository;

import espritSpring.tn.seance1.Entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription , Long> {
}

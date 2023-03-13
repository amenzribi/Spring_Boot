package espritSpring.tn.seance1.Repository;

import espritSpring.tn.seance1.Entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    Abonnement findBynumSkieur(Long numSkieur);
}

package espritSpring.tn.seance1.Repository;

import espritSpring.tn.seance1.Entities.Abonnement;
import espritSpring.tn.seance1.Entities.Skieur;
import espritSpring.tn.seance1.Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    Abonnement findBynumAbon(Long numAbon);
  /*  @Query("SELECT s FROM Skieur s JOIN s.abonnements a WHERE a.typeAbonnement = :typeAbonnement")
    Set<Skieur> findByAbonnementType(@Param("typeAbonnement") TypeAbonnement typeAbonnement);

   */




    @Query("SELECT a FROM Abonnement a WHERE a.typeAbonnement = :typeAbonnement ORDER BY a.dateDebut")
    Set<Abonnement> getAbonnementByType(TypeAbonnement typeAbonnement);
}

/*
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    @Query("SELECT a FROM Abonnement a JOIN a.skieur s WHERE a.typeAbonnement = :type ORDER BY a.dateDebut ASC")
    Set<Abonnement> findByTypeAndOrderByDateDebut(@Param("type") TypeAbonnement type);
}

 */


package espritSpring.tn.seance1.Services;

import espritSpring.tn.seance1.Entities.Abonnement;
import espritSpring.tn.seance1.Entities.Skieur;
import espritSpring.tn.seance1.Entities.TypeAbonnement;
import espritSpring.tn.seance1.Repository.AbonnementRepository;
import espritSpring.tn.seance1.Repository.SkieurRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Service
@Transactional
public class AbonnementService implements AbonnementServ {

  //  SkieurRepository skieurRepository;
    AbonnementRepository abonnementRepository;


    @Override
    public Set<Abonnement> getAbonnementByType(TypeAbonnement type) {
        return abonnementRepository.getAbonnementByType(type);
    }

  /* @Override
    public List<Skieur> retrieveSkieursByAbonnementType(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnementType(typeAbonnement);
    }

   */
}

/*
@Transactional
 public Set<Abonnement> getAbonnementByType(TypeAbonnement type) {
        return abonnementRepository.findByTypeAndOrderByDateDebut(type);
    }
    //getAbonnementBydate_debut
 */


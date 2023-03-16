package espritSpring.tn.seance1.Services;

import espritSpring.tn.seance1.Entities.Cours;
import espritSpring.tn.seance1.Entities.Inscription;
import espritSpring.tn.seance1.Entities.Moniteur;
import espritSpring.tn.seance1.Repository.CoursRepo;
import espritSpring.tn.seance1.Repository.InscriptionRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class InscriptionService implements IInscriptionServ {

    InscriptionRepository inscriptionRepository ;
    CoursRepo coursRepo;

    @Override
    public Inscription assignInscriptionToCours(Long numInscription, Long numCours) {
        Inscription inscription = inscriptionRepository.findByNumInscription(numInscription);
        inscription.setCours(coursRepo.findByNumCours(numCours));
     return    inscriptionRepository.save(inscription);



    }
}

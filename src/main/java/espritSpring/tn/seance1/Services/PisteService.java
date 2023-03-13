package espritSpring.tn.seance1.Services;

import espritSpring.tn.seance1.Entities.Cours;
import espritSpring.tn.seance1.Entities.Moniteur;
import espritSpring.tn.seance1.Entities.Piste;
import espritSpring.tn.seance1.Entities.Skieur;
import espritSpring.tn.seance1.Repository.PisteRepository;
import espritSpring.tn.seance1.Repository.SkieurRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PisteService {
    PisteRepository pisteRepository;
    SkieurRepository skieurRepository;

}

/*
    @Override
    public Skieur assignSkieurToPiste(Skieur skieur, Long numPiste) {
        Skieur s = skieurRepository.findBynumSkieur(numSkieur);
        Piste p = pisteRepository.findBynumPiste.get();

        p.getSkieurs().add(s);
        return s;
    }

    public Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Moniteur m =   moniteurRepository.save(moniteur);
        Cours cours = coursRepo.findById(numCourse).get();
        m.getCours().add(cours);
        return    moniteurRepository.save(m);



}

 */

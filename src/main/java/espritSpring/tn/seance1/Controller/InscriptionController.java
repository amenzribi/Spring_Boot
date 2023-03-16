package espritSpring.tn.seance1.Controller;

import espritSpring.tn.seance1.Entities.Inscription;
import espritSpring.tn.seance1.Entities.Moniteur;
import espritSpring.tn.seance1.Entities.Skieur;
import espritSpring.tn.seance1.Services.InscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RestController
@RequestMapping("/inscription")
public class InscriptionController {

    InscriptionService inscriptionService;

    @PostMapping("/add/{numInscription}/{numCours}")
    public Inscription assignInscriptionToCours(@PathVariable ("numInscription") Long numInscription , @PathVariable ("numCours") Long numCours) {
        return inscriptionService.assignInscriptionToCours(numInscription, numCours);
    }

}

package espritSpring.tn.seance1.Controller;

import espritSpring.tn.seance1.Entities.Moniteur;
import espritSpring.tn.seance1.Entities.Piste;
import espritSpring.tn.seance1.Entities.Skieur;
import espritSpring.tn.seance1.Services.MoniteurService;
import espritSpring.tn.seance1.Services.SkieurService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skieurs")
public class SkieurController {



 /*   public SkieurController(SkieurService skieurServices) {
        this.skieurServices = skieurServices;
    }

  */

  /*  @PostMapping("/addskieur")
    public Skieur addSkieur(@PathVariable ("numSkieur") Long numSkieur , @PathVariable  ("numPiste") Long numPiste) {
        Skieur skieur1  = skieurService.addSkieurAndAssignToPiste(numSkieur , numPiste);
        return skieur1;
    }

   */




        private SkieurService skieurService;

        public SkieurController(SkieurService skieurService) {
            this.skieurService = skieurService;
        }

        @PostMapping("/assign-piste")
        public Skieur assignSkieurToPiste(@RequestBody Skieur skieur, @RequestParam Long numPiste) {
            return skieurService.addSkieurAndAssignToPiste(skieur, numPiste);
        }






    @PostMapping("/{numCours}")
    public Skieur addSkieurAndAssignToCours(@RequestBody Skieur skieur, @PathVariable Long numCours) {
        return skieurService.addSkieurAndAssignToCours(skieur, numCours);
    }


    }












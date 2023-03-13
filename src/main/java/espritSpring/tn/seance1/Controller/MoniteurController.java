package espritSpring.tn.seance1.Controller;

import espritSpring.tn.seance1.Entities.Moniteur;
import espritSpring.tn.seance1.Services.MoniteurServ;
import espritSpring.tn.seance1.Services.MoniteurService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/moniteur")
public class MoniteurController {

  MoniteurService moniteurService;
    MoniteurServ moniteurServ;
    public MoniteurController(MoniteurService moniteurService) {
        this.moniteurService = moniteurService;
    }
 /*   public MoniteurController(MoniteurService moniteurService) {
        this.moniteurService = moniteurService;
    }
*/
  //
 /* public MoniteurController(MoniteurService moniteurService) {
        this.moniteurService = moniteurService ;
    }*/

   /* @GetMapping("/allmoniteurs")
    public List<Moniteur> getMoniteurs() {
        List<Moniteur> listM = moniteurService.retrieveAllMoniteurs();
        return listM;
    }*/
    @GetMapping("/all")
    public ResponseEntity<List<Moniteur>> getAllMoniteurs() {
        List<Moniteur> moniteurs = moniteurService.retrieveAllMoniteurs();
        return new ResponseEntity<>(moniteurs, HttpStatus.OK);
    }





    @GetMapping("/retrieve-moniteur/{moniteur-id}")
    public Moniteur retrieveMoniteur(@PathVariable(" moniteur-id") Long moniteurId) {
            return moniteurService.retrieveMoniteur(moniteurId);
}

    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur = moniteurService.addMoniteur(m);
        return moniteur;
    }

    @DeleteMapping("/remove-moniteur/{moniteur-id}")
    public void removeMoniteur(@PathVariable("moniteur-id") Long moniteurId) {
        moniteurService.deleteMoniteur(moniteurId);
    }

    @PutMapping("/update-moniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur= moniteurService.updateMoniteur(m);
        return moniteur;
    }

/*
    @GetMapping("/all")
    public ResponseEntity<List<Moniteur>> getMoniteurs() {
        List<Moniteur> moniteurs = MoniteurServ.retrieveAllMoniteurs();
        return new ResponseEntity<>(moniteurs, HttpStatus.OK);
    }
*/
}

package espritSpring.tn.seance1.Controller;

import espritSpring.tn.seance1.Entities.Abonnement;
import espritSpring.tn.seance1.Entities.TypeAbonnement;
import espritSpring.tn.seance1.Services.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/abonnements")
public class AbonnementController {

        @Autowired
        private AbonnementService abonnementService;

        @GetMapping("/{type}")
        public ResponseEntity<Set<Abonnement>> getAbonnementByType(@PathVariable("type") TypeAbonnement typeAbonnement) {
            Set<Abonnement> abonnements = abonnementService.getAbonnementByType(typeAbonnement);
            return ResponseEntity.ok(abonnements);
        }
}

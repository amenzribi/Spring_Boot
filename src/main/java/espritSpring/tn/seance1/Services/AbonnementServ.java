package espritSpring.tn.seance1.Services;

import espritSpring.tn.seance1.Entities.Abonnement;
import espritSpring.tn.seance1.Entities.TypeAbonnement;

import java.util.Set;

public interface AbonnementServ {
    Set<Abonnement> getAbonnementByType(TypeAbonnement typeAbonnement);



}

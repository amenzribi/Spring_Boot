package espritSpring.tn.seance1.Services;

import espritSpring.tn.seance1.Entities.Inscription;

public interface IInscriptionServ {


    Inscription assignInscriptionToCours(Long numInscription, Long numCours);
}

package espritSpring.tn.seance1.Services;

import espritSpring.tn.seance1.Entities.Abonnement;
import espritSpring.tn.seance1.Entities.Inscription;
import espritSpring.tn.seance1.Entities.Piste;
import espritSpring.tn.seance1.Entities.Skieur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IskieurServ {
  //  Skieur addSkieurtoPiste(Skieur skieur , Long numPiste);

    /*

        public Skieur addSkieurtoPiste(Piste piste, Long numPiste) {
            Piste p =  pisteRepository.findBynumPiste().get();
            Skieur s = skieurRepository.findBynumSkieur();


            s.get().add(piste);
            return skieurRepository.save(s);
        }

         */
    Skieur addSkieurAndAssignToPiste(Skieur skieur, Long numPiste);

    Skieur updateSkieur(Long id, Skieur skieur);

    void deleteSkieur(Long id);

    List<Skieur> findAllSkieurs();

    /* @Override
     public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours) {
         // Créer un nouvel abonnement pour le skieur
         Abonnement abonnement = new Abonnement();
         abonnement.setDateDebut(LocalDate.now());
         abonnement.setDateFin(LocalDate.now().plusMonths(6)); // abonnement de 6 mois
         abonnement.setSkieur(skieur);

         // Sauvegarder l'abonnement dans la base de données
         abonnementRepository.save(abonnement);

         // Créer une nouvelle inscription pour le skieur et l'abonnement
         Inscription inscription = new Inscription();
         inscription.setNumSemaine();
         inscription.setCours(coursRepo.findByNumCours(numCours));
         inscription.set(abonnement);

         // Sauvegarder l'inscription dans la base de données
         inscriptionRepository.save(inscription);

         // Sauvegarder le skieur dans la base de données
         skieurRepository.save(skieur);

         // Ajouter le skieur à la liste des skieurs inscrits au cours
         Cours cours = coursRepo.findByNumCours(numCours);

         // Vérifier si le cours existe
         if (cours == null) {
             throw new IllegalArgumentException("Le numéro de cours fourni est invalide : " + numCours);
         }

         // Initialiser la collection des skieurs inscrits si nécessaire
         if (cours.getSkieurs() == null) {
             cours.initSkieurs();
         }

         // Ajouter le skieur à la liste des skieurs inscrits au cours
         cours.getSkieurs().add(skieur);

         // Sauvegarder les modifications dans la base de données
         coursRepository.save(cours);

         return skieur;
     }

     */
  //  Inscription addInscription(Skieur skieur, Abonnement abonnement);

    Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);

    // Skieur addSkieurtoPiste(Skieur skieur, Long numPiste);
}

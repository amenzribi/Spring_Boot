package espritSpring.tn.seance1.Services;

import espritSpring.tn.seance1.Entities.*;
import espritSpring.tn.seance1.Repository.*;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;


@NoArgsConstructor
@Service
public class SkieurService implements IskieurServ{
    PisteRepository pisteRepository;
    SkieurRepository skieurRepository;
    AbonnementRepository abonnementRepository;
    InscriptionRepository inscriptionRepository;
    CoursRepo coursRepo;

    public SkieurService(PisteRepository pisteRepository, SkieurRepository skieurRepository) {
        this.pisteRepository = pisteRepository;
        this.skieurRepository = skieurRepository;
    }

    @Override
    public Skieur addSkieurAndAssignToPiste(Skieur skieur, Long numPiste) {
        Skieur skieur1 = skieurRepository.save(skieur);
        Piste piste = pisteRepository.findBynumPiste(numPiste);
        skieur1.getPistes().add(piste);
        return skieurRepository.save(skieur1);
    }

    @Override
    public Skieur updateSkieur(Long id, Skieur skieur) {
        Skieur skieurToUpdate = skieurRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Skieur not found with id : " + id));
        skieurToUpdate.setNomS(skieur.getNomS());
        skieurToUpdate.setPrenomS(skieur.getPrenomS());
        skieurToUpdate.setDateNaissance(skieur.getDateNaissance());
        skieurToUpdate.setVille(skieur.getVille());

        return skieurRepository.save(skieurToUpdate);
    }
    @Override
    public void deleteSkieur(Long id) {
        Skieur skieurToDelete = skieurRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Skieur not found with id : " + id));
        skieurRepository.delete(skieurToDelete);
    }

    @Override
    public List<Skieur> findAllSkieurs() {
        return skieurRepository.findAll();
    }

    /*

        public Skieur addSkieurtoPiste(Piste piste, Long numPiste) {
            Piste p =  pisteRepository.findBynumPiste().get();
            Skieur s = skieurRepository.findBynumSkieur();


            s.get().add(piste);
            return skieurRepository.save(s);
        }

         */


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
    /*
   @Override
   public Inscription addInscription(Skieur skieur, Abonnement abonnement) {
       // créer une nouvelle instance de Inscription
       Inscription inscription = new Inscription();

       // affecter le Skieur et l'Abonnement à l'inscription
       inscription.setSkieurs(skieur);
      // inscription.setabonnement(abonnement);

       // affecter la date d'inscription à aujourd'hui
       inscription.setDateInscription(LocalDate.now());

       // enregistrer l'inscription dans la base de données et retourner l'objet Inscription sauvegardé
       return inscriptionRepository.save(inscription);
   }

     */

    @Override
   public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours) {
        //créer un nouvel abonnement pour le skieur
       Abonnement abonnement = new Abonnement();
       abonnement.setDateDebut(LocalDate.now());
       abonnement.setDateFin(LocalDate.now().plusMonths(6)); // abonnement de 6 mois
       abonnement.setSkieur(skieur);

       //sauvegarder l'abonnement dans la base de données
       abonnementRepository.save(abonnement);

       //créer une nouvelle inscription pour le skieur et l'abonnement
       Inscription inscription = new Inscription();
       inscription.setDateInscription(LocalDate.now());
       inscription.setCours(coursRepo.findByNumCours(numCours));
      // inscription.setAbonnement(abonnementRepository.findBynumSkieur(n));

       //sauvegarder l'inscription dans la base de données
       inscriptionRepository.save(inscription);

       //sauvegarder le skieur dans la base de données
       skieurRepository.save(skieur);

       //récupérer le cours correspondant
       Cours cours = coursRepo.findByNumCours(numCours);

       //vérifier si le cours existe
       if (cours == null) {
           throw new IllegalArgumentException("Le numéro de cours fourni est invalide : " + numCours);
       }

       //ajouter le skieur à la liste des skieurs inscrits au cours
       inscription.getCours().getSkieur().add(skieur);

       //sauvegarder les modifications dans la base de données
       coursRepo.save(inscription.getCours());

       return skieur;
   }



}

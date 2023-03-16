package espritSpring.tn.seance1.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Skieur implements Serializable {
    @Id
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @OneToOne(cascade = CascadeType.ALL )
    private Abonnement abonnement;

    @OneToMany(cascade = CascadeType.ALL , mappedBy ="skieurs" )
    private Set<Inscription> inscriptions;





@ManyToMany(cascade = CascadeType.ALL , mappedBy = "skieurs")
private Set<Piste> pistes;
    @Override
    public String toString() {
        return "Skieur{" +
                "numSkieur=" + numSkieur +
                ", nomS='" + nomS + '\'' +
                ", prenomS='" + prenomS + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", ville='" + ville + '\'' +
                '}';
    }
}

package espritSpring.tn.seance1.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Abonnement implements Serializable {
    @Id
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin ;
    private Float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbonnement;

    @Override
    public String toString() {
        return "Abonnement{" +
                "numAbon=" + numAbon +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", prixAbon=" + prixAbon +
                ", typeAbonnement=" + typeAbonnement +
                '}';
    }

    public void setSkieur(Skieur skieur) {
    }
}

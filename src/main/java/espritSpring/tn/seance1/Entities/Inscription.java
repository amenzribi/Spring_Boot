package espritSpring.tn.seance1.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Inscription implements Serializable {
    @Id
    private Long numInscription;
    private Integer numSemaine;
    private LocalDate dateInscription;
    @ManyToOne
    private Skieur skieurs;

@ManyToOne
private Cours cours;

    @Override
    public String toString() {
        return "Inscription{" +
                "numInscription=" + numInscription +
                ", numSemaine=" + numSemaine +
                '}';
    }
}

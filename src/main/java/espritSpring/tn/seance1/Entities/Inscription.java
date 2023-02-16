package espritSpring.tn.seance1.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
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
    @ManyToOne
     Skieur skieurs;

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

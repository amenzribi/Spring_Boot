package espritSpring.tn.seance1.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Moniteur implements Serializable {
    @Id
    @Column(name = "idMoniteur")
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;

        @OneToMany(cascade = CascadeType.ALL)
     private Set<Cours>  cours;
    @Override
    public String toString() {
        return "Moniteur{" +
                "numMoniteur=" + numMoniteur +
                ", nomM='" + nomM + '\'' +
                ", prenomM='" + prenomM + '\'' +
                ", dateRecru=" + dateRecru +
                '}';
    }
}

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
public class Cours implements Serializable {
    @Id
    private Long numCours;
    private Integer niveau;

    @Enumerated(EnumType.STRING)
    private  TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private Integer creneau;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
    private Set<Inscription> inscription;

    @Override
    public String toString() {
        return "Cours{" +
                "numCours=" + numCours +
                ", niveau=" + niveau +
                ", typeCours=" + typeCours +
                ", support=" + support +
                ", prix=" + prix +
                ", creneau=" + creneau +
                '}';
    }
}


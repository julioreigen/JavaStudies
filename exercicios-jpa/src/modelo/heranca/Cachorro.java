package modelo.heranca;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cachorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String raca;

    public Cachorro() {
    }

    public Cachorro(String raca) {
        this.raca = raca;
    }

    public Long getId() {
        return id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

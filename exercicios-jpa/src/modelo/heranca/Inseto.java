package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Inseto {
    @Id
    private Long insetoId;
    private Boolean voa;

    public Inseto() {
    }

    public Inseto(Boolean voa) {
        this.voa = voa;
    }

    public Long getInsetoId() {
        return insetoId;
    }

    public Boolean getVoa() {
        return voa;
    }

    public void setVoa(Boolean voa) {
        this.voa = voa;
    }
}

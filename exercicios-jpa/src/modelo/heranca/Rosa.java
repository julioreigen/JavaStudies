package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rosas")
public class Rosa extends Flor {
    private String tipo;

    public Rosa(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    public Rosa() {
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

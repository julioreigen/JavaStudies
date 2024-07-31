package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "formigaId")
public class Formiga extends Inseto {
    private String nome;

    public Formiga(String nome) {
        super(false);
        this.nome = nome;
    }

    public Formiga() {
        this("desconhecido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

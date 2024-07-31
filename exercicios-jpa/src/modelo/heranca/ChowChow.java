package modelo.heranca;

import javax.persistence.Entity;

@Entity
public class ChowChow extends Cachorro {
    private String nome;

    public ChowChow(String nome) {
        super("Chow-Chow");
        this.nome = nome;
    }

    public ChowChow() {
        this("Desconhecido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

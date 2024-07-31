package modelo.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sobrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToMany(mappedBy = "sobrinhos")
    private List<Tio> tios = new ArrayList<>();

    public Sobrinho() {
    }

    public Sobrinho(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Tio> getTios() {
        return tios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

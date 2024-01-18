package excecao_09;

import java.util.Objects;

public class Aluno {
    private final String nome;
    private final double nota;
    private final double presenca;

    public Aluno(String nome, double nota) {
        this(nome, nota, 100);
    }
    public Aluno(String nome, double nota, double presenca) {
        this.nome = nome;
        this.nota = nota;
        this.presenca = presenca;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public double getPresenca() {
        return presenca;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(getNota(), aluno.getNota()) == 0 && Double.compare(getPresenca(), aluno.getPresenca()) == 0 && Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNota(), getPresenca());
    }
}

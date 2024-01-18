package streams_08.orderList;

public class Aluno {

    private Double nota;
    private String nome;
    private Integer idade;

    public Aluno(String nome, Integer idade, Double nota) {
        this.nota = nota;
        this.nome = nome;
        this.idade = idade;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nAluno [nota= " + nota + ", nome= " + nome + ", idade= " + idade + "]";
    }
}

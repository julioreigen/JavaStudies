package teste.consulta;

import infra.Dao;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {
    public static void main(String[] args) {

        Dao<Filme> dao = new Dao<>(Filme.class);
        List<Filme> filmes = dao.consultar(
                "obterFilmesComNotaMaiorQue",
                "nota", 8.5);

        for (Filme filme: filmes) {
            System.out.println(filme.getNome() + "  -> " + filme.getNota());
            for (Ator ator: filme.getAtores()) {
                System.out.println(ator.getNome());
            }
        }
    }
}

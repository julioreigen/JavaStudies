package teste.consulta;

import infra.Dao;
import modelo.consulta.NotaFilme;
import modelo.muitospramuitos.Filme;

public class ObterMediaFilmes {
    public static void main(String[] args) {

        Dao<NotaFilme> dao = new Dao<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaGeral");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}

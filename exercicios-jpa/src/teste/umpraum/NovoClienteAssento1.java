package teste.umpraum;

import infra.Dao;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        Assento assento = new Assento("16A");
        Cliente cliente = new Cliente("Carlos", assento);

        Dao<Object> dao = new Dao<>();
        dao.abrirTransacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTransacao()
                .fechar();
    }
}

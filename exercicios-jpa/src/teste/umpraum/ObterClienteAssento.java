package teste.umpraum;

import infra.Dao;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {

        Dao<Cliente> daoCliente = new Dao<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println(cliente.getAssento().getNome());
        daoCliente.fechar();

        Dao<Assento> daoAssento = new Dao<>(Assento.class);

        Assento assento = daoAssento.obterPorId(4L);
        System.out.println(assento.getCliente().getNome());
        daoAssento.fechar();
    }
}

package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        // Inicia uma transação (Necessário para alterar algo no banco)
        em.getTransaction().begin();

        // Encontra o usuário pelo Id e altera o nome e o email
        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Leonardo");
        em.detach(usuario);

        // Mescla as informações alteradas com outras informações do usuário que estão no banco
        em.merge(usuario);

        // Envia a transação para o banco.
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

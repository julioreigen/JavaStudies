package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        // Inicia uma transação (Necessário para alterar algo no banco)
        em.getTransaction().begin();

        // Encontra o usuário pelo Id e altera o nome e o email
        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Leonardo Alterador");

        // Envia a transação para o banco.
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

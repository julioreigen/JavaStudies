package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        /* O CÓDIGO DO COMENTÁRIO FAZ A MESMA COISA QUE O LIST 'usuarios' ABAIXO DO COMENTÁRIO.

        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();
        */

        List<Usuario> usuarios = em
                .createQuery("select u from Usuario u", Usuario.class)
                .setMaxResults(5)
                .getResultList();

        usuarios.forEach(u -> System.out.println("Id: " + u.getId() + "   Email: " + u.getEmail()));

        em.close();
        emf.close();
    }
}

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario novoUsuario = new Usuario("Bimba", "teste@lanche.com.br");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();

		System.out.printf("O id gerado foi: %d\n", novoUsuario.getId());

		em.close();
		emf.close();
	}
}
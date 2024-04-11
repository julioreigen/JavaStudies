package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Dao<E> {
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        } catch (Exception e) {

        }
    }

    public Dao() {
        this(null);
    }

    public Dao(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public Dao<E> abrirTransacao() {
        em.getTransaction().begin();
        return this;
    }

    public Dao<E> fecharTransacao() {
        em.getTransaction().commit();
        return this;
    }

    public Dao<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    public Dao<E> incluirAtomico(E entidade) {
        return this.abrirTransacao().incluir(entidade).fecharTransacao();
    }

    public E obterPorId(Object id) {
        return em.find(classe, id);
    }

    public List<E> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int limit, int offset) {
        if (classe == null)
            throw new UnsupportedOperationException("A classe não pode ser nula!");

        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(limit);
        query.setFirstResult(offset);

        return query.getResultList();
    }

    public void fechar() {
        em.close();
    }
}

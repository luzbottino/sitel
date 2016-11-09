/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.dao;

import br.com.lbottino.sitel.util.JPAUtil;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author pig
 */
public abstract class GenericDAO<T extends Serializable> {

    private Class<T> aClass;

    protected GenericDAO(Class<T> aClass) {
        this.aClass = aClass;
    }

    protected EntityManager getEntityManager() {
        return JPAUtil.getInstance().getEntityManager();
    }

    public List<T> find(String jpql, Object... params) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();

            Query query = getEntityManager().createQuery(jpql);

            for (int i = 0; i < params.length; i++) {
                query.setParameter(i + 1, params[i]);
            }

            List<T> entities = query.getResultList();

            entityManager.getTransaction().commit();

            return entities;

        } catch (NoResultException e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
            return null;
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public T findOne(String jpql, Object... params) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();

            Query query = getEntityManager().createQuery(jpql);

            for (int i = 0; i < params.length; i++) {
                query.setParameter(i + 1, params[i]);
            }

            T entity = (T) query.getSingleResult();

            entityManager.getTransaction().commit();

            return entity;

        } catch (Exception e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
            return null;
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public long count() {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();

            Query query = entityManager.createQuery("select count(c) from " + aClass.getSimpleName() + " c");
            long count = (Long) query.getSingleResult();
            entityManager.getTransaction().commit();
            return count;
        } catch (Exception e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
            return 0;
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public T findById(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            T entity = (T) getEntityManager().find(aClass, id);
            entityManager.getTransaction().commit();
            return entity;
        } catch (Exception e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
            return null;
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<T> findAll() {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();

            Query query = entityManager.createQuery("from " + aClass.getSimpleName());
            List<T> entities = query.getResultList();

            entityManager.getTransaction().commit();
            return entities;
        } catch (Exception e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
            return null;
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void save(T entity) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void update(T entity) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void delete(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.getReference(aClass, id));
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.isOpen()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }
}

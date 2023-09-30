package com.diego.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.io.Serializable;
import java.util.List;

public class GenericDAO<T, PK extends Serializable> implements IGenericDAO<T, PK> {
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    private EntityTransaction transaction;

    public GenericDAO(String persistenceUnitName) {
        entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(T entity) {
        startTransaction();
        entityManager.persist(entity);
    }

    @Override
    public void update(T entity) {
        startTransaction();
        entityManager.merge(entity);
    }

    @Override
    public void delete(T entity) {
        startTransaction();
        entityManager.remove(entity);
    }

    @Override
    public T getById(PK id, Class<T> type) {
        return entityManager.find(type, id);
    }

    @Override
    public List<T> getAll(Class<T> type) {
        return entityManager.createQuery("SELECT e FROM " + type.getSimpleName() + " e").getResultList();
    }

    @Override
    public void commit() {
        if (transaction != null && transaction.isActive()) {
            transaction.commit();
        }
    }

    private void startTransaction() {
        if (transaction == null || !transaction.isActive()) {
            transaction = entityManager.getTransaction();
            transaction.begin();
        }
    }

    public void close() {
        if (transaction != null && transaction.isActive()) {
            transaction.commit();
        }

        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }

        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
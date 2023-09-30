package com.diego.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDAO<T, PK extends Serializable> {

    void save(T entity);

    void update(T entity);

    void delete(T entity);

    T getById(PK id, Class<T> type);

    List<T> getAll(Class<T> type);

    void commit();
}
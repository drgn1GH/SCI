package ro.sci.carrental.db;

import java.util.List;

/**
 * CRUD interface generics
 * @param <T> can be car or customer or transaction
 */
public interface RepositoryI<T> {

    void add(T t);

    void remove(T t);

    void update(T t);

    List<T> getAll();

}

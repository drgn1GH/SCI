package ro.sci.carrental.service;

import ro.sci.carrental.repository.TransactionRepositoryInterface;

import java.util.List;

/**
 * Created by tudor on 14.06.2017.
 */
public interface TransactionInterceptorServiceInterface<T extends TransactionRepositoryInterface> {
    /**
     * Find the transactions by it's ID
     *
     * @return retrieve Transaction Repository List<Transaction>
     */
    List<T> findTransactionById(int id);

    /**
     * Find the transactions by it's name
     *
     * @return retrieve Transaction Repository List<Transaction>
     */
    List<T> findTransactionByName(String name);
}

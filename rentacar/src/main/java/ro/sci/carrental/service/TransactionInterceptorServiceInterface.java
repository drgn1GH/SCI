package ro.sci.carrental.service;

import ro.sci.carrental.model.calendar.Transaction;

import java.util.List;

/**
 * Created by tudor on 14.06.2017.
 */
public interface TransactionInterceptorServiceInterface {
    /**
     * Find the transactions by it's ID
     *
     * @return retrieve Transaction Repository List<Transaction>
     */
    List<Transaction> findTransactionById(int id);

    /**
     * Find the transactions by it's name
     *
     * @return retrieve Transaction Repository List<Transaction>
     */
    List<Transaction> findTransactionByName(String name);
}

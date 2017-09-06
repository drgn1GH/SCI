package ro.sci.carrental.repository;

import ro.sci.carrental.model.calendar.Transaction;

import java.util.List;
import java.util.Set;

/**
 * Created by tudor on 14.06.2017.
 */
public interface TransactionRepositoryInterface<T extends Transaction> {
    /**
     * Finds a transaction by it's ID
     *
     * @param id Transaction's ID
     * @return List<Transaction>
     */
    List<T> findTransactionById(int id);

    /**
     * Finds a transaction by it's name
     *
     * @param name Transaction's name
     * @return List<Transaction>
     */

    List<T> findTransactionByName(String name);

    /**
     * Add a transaction in the system
     *
     * @param transaction
     */
    void addTransaction(T t);

    /**
     * Removes a transaction in the system
     *
     * @param transaction
     */
    void deleteTransaction(T t);

    /**
     * Updates a transaction in the system
     *
     * @param transaction
     */
    void updateTransaction(T t);

    /**
     * Gets all Transactions in the system;
     *
     * @return
     */
    Set<T> getTransactions();
}

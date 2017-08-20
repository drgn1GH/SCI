package ro.sci.carrental.repository;

import ro.sci.carrental.model.calendar.Transaction;

import java.util.List;
import java.util.Set;

/**
 * Created by tudor on 14.06.2017.
 */
public interface TransactionRepositoryInterface {
    /**
     * Finds a transaction by it's ID
     *
     * @param id Transaction's ID
     * @return List<Transaction>
     */
    List<Transaction> findTransactionById(int id);

    /**
     * Finds a transaction by it's name
     *
     * @param name Transaction's name
     * @return List<Transaction>
     */

    List<Transaction> findTransactionByName(String name);

    /**
     * Add a transaction in the system
     *
     * @param transaction
     */
    void addTransaction(Transaction transaction);

    /**
     * Removes a transaction in the system
     *
     * @param transaction
     */
    void deleteTransaction(Transaction transaction);

    /**
     * Updates a transaction in the system
     *
     * @param transaction
     */
    void updateTransaction(Transaction transaction);

    /**
     * Gets all Transactions in the system;
     *
     * @return
     */
    Set<Transaction> getTransactions();
}

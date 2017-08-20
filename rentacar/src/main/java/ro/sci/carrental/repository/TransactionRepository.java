package ro.sci.carrental.repository;

import ro.sci.carrental.model.calendar.Transaction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Create a transaction repository object blueprint
 * Created by tudor on 14.06.2017.
 */
public class TransactionRepository implements TransactionRepositoryInterface {
    private Set<Transaction> transactions;

    public TransactionRepository() {
        this.transactions = new HashSet<>();
    }

    public List<Transaction> findTransactionById(int id) {
        List<Transaction> foundTransactions = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.getId() == id) {
                foundTransactions.add(transaction);
                System.out.println(transaction);
            }
        }
        return foundTransactions;
    }


    public List<Transaction> findTransactionByName(String name) {
        List<Transaction> foundTransactions = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.getName().equalsIgnoreCase(name)) {
                foundTransactions.add(transaction);
                System.out.println(transaction);
            }
        }
        return foundTransactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }


    public void deleteTransaction(Transaction transaction) {
        transactions.remove(transaction);
    }

    public void updateTransaction(Transaction transaction) {

    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}

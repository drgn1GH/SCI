package ro.sci.carrental.service;

import ro.sci.carrental.model.calendar.Transaction;
import ro.sci.carrental.repository.TransactionRepository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Create a transaction interceptor service object blueprint
 * Created by tudor on 14.06.2017.
 */
public class TransactionInterceptorService implements TransactionInterceptorServiceInterface {
    private static final Logger logger = Logger.getLogger(TransactionInterceptorService.class.getName());

    private TransactionRepository transactionRepository;

    public TransactionInterceptorService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findTransactionById(int id) {
        if (id == 0) {
            logger.log(Level.INFO,"find result is null");
            return null;
        }
        return transactionRepository.findTransactionById(id);
    }

    public List<Transaction> findTransactionByName(String name) {
        if (null == name || name.isEmpty()) {
            logger.log(Level.INFO,"find result is null");
            return null;
        }
        return transactionRepository.findTransactionByName(name);
    }
}

package com.italo.money.service;

import com.italo.money.model.SystemUser;
import com.italo.money.model.Transaction;
import com.italo.money.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends BaseService{

    @Autowired
    private TransactionRepository transactionRepository;

    public void saveTransaction(Transaction transaction, SystemUser responsible){
        Transaction transactionToSave = (Transaction) feedBaseFields(transaction, responsible);
        transactionToSave.setActive(true);
        transactionRepository.save(transactionToSave);
    }

    public void deleteTransaction(Transaction transaction, SystemUser responsible){
        Transaction transactionToSave = (Transaction) feedBaseFields(transaction, responsible);
        transactionToSave.setActive(false);
        transactionRepository.save(transactionToSave);
    }
}

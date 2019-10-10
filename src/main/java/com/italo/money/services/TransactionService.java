package com.italo.money.services;

import com.italo.money.models.SystemUser;
import com.italo.money.models.Transaction;
import com.italo.money.repositories.SystemUserRepository;
import com.italo.money.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends BaseService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private SystemUserRepository systemUserRepository;


    public void saveTransaction(Transaction transaction, String responsibleUuid){
        SystemUser responsible = systemUserRepository.findByUuid(responsibleUuid);
        Transaction transactionToSave = (Transaction) feedBaseFields(transaction, responsible);
        transactionToSave.setActive(true);
        transactionRepository.save(transactionToSave);
    }

    public void deleteTransaction(Transaction transaction, String responsibleUuid){
        SystemUser responsible = systemUserRepository.findByUuid(responsibleUuid);
        Transaction transactionToSave = (Transaction) feedBaseFields(transaction, responsible);
        transactionToSave.setActive(false);
        transactionRepository.save(transactionToSave);
    }
}

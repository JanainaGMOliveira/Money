package com.italo.money.endpoints;

import com.italo.money.models.Transaction;
import com.italo.money.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionEndpoint {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/{userId}")
    public void saveTransaction(@RequestBody Transaction transaction, @PathVariable String userId){
        transactionService.saveTransaction(transaction, userId);
    }
}

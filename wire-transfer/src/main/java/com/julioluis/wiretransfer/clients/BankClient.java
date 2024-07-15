package com.julioluis.wiretransfer.clients;

import com.julioluis.wiretransfer.model.Transaction;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("bank")
public interface BankClient {

    @PostMapping(path = "/transactions")
    ResponseEntity<Transaction> payment(@RequestBody Transaction transaction);

}

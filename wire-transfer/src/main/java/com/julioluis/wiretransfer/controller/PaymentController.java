package com.julioluis.wiretransfer.controller;


import com.julioluis.wiretransfer.clients.BankClient;
import com.julioluis.wiretransfer.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.time.LocalDateTime;



@RestController
@RequestMapping("api/transactions")
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${transfer.url}")
    private String transferUrl;

    @Autowired
    private BankClient bankClient;

    @PostMapping
    public ResponseEntity<Transaction> payment(@RequestBody Transaction tranx) {
//        String url = transferUrl;
        tranx.setTransactionDate(LocalDateTime.now());
        ResponseEntity<Transaction> response = bankClient.payment(tranx);

        return response;
    }
}

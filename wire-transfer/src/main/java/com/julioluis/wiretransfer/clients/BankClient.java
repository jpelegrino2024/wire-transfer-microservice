//package com.julioluis.wiretransfer.clients;
//
//import com.julioluis.wiretransfer.model.Transaction;
//import feign.Headers;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@FeignClient(name = "bank", url = "http://localhost:8093/transactions")
//public interface BankClient {
//
//    @PostMapping
//    @Headers(value = "Content-Type: application/json")
//    ResponseEntity<Transaction> payment(@RequestBody Transaction transaction);
//
//}

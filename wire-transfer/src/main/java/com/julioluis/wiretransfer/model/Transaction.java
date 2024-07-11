package com.julioluis.wiretransfer.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Transaction {
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private String transactionOrigin;
    private String transactionType;
    private String accountNumber;
}

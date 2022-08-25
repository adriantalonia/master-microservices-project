package com.mmp.accountservice.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    protected long id;
    private int customerId;
    private String accountType;
    private String branchAddress;
    private LocalDateTime created;
}

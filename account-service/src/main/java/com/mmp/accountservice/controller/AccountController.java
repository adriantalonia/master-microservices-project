package com.mmp.accountservice.controller;

import com.mmp.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping(path = "/{customerId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getAccountByCustomerId(@PathVariable int customerId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.findByCustomerId(customerId));
    }


}

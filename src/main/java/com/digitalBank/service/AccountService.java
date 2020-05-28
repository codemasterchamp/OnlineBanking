package com.digitalBank.service;

import java.security.Principal;

import com.digitalBank.domain.PrimaryAccount;
import com.digitalBank.domain.SavingsAccount;

public interface AccountService {

	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	
	void deposit(String accountType, double amount, Principal principal);
	void withdraw(String accountType, double amount, Principal principal);
}

package com.assement.week5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assement.week5.Service.BankService;
import com.assement.week5.Models.Bank;


@Controller
@RequestMapping()
@CrossOrigin("*")
public class BankController {
	
	@Autowired
	private BankService bankService;

	@GetMapping("/bankaccounts/{id}")
	public List<Bank> getBankAccounts(@PathVariable("id") String id) {
		return bankService.getAccountsById(id);
	}
	
	@PostMapping("/bankaccounts/{id}/create")
	public Bank createBank(@PathVariable("id") String id, Bank bank) {
		return bankService.createAccount(bank, id);
	}
	
	@PostMapping("/bankaccounts/delete/{id}")
	public List<Bank> deleteBank(@PathVariable("id") String id) {
		return bankService.deleteAccount(id);
	}
}
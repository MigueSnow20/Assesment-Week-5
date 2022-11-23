package com.assement.week5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assement.week5.Service.BankService;
import com.assement.week5.Models.Bank;


@Controller
@RequestMapping()
@CrossOrigin("*")
public class BankController {
	
//	Bank bank = new Bank("Labadie Bank", 1168.00, , "O'Hara");
//	
//	
//	@Autowired
//	private BankService bankService;
//
//	@GetMapping("/bankaccounts")
//	public Bank getBankAccounts(Model model) {
//		model.addAttribute("list", bankService.getAll());
//		return bank;
//	}
}
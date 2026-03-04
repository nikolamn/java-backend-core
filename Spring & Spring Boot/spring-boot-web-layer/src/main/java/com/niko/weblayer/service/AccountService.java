package com.niko.weblayer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niko.weblayer.dto.ResponseDTO;
import com.niko.weblayer.exception.UsernameTakenException;
import com.niko.weblayer.model.Account;
import com.niko.weblayer.repository.AccountRepository;

@Service
public class AccountService {

	private final AccountRepository accountRepository;

	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public ResponseDTO create(String username) {
		Optional<Account> existing = accountRepository.findByUsername(username);
		if (existing.isPresent()) {
			throw new UsernameTakenException("Username already taken");
		}

		Account acc = new Account();
		acc.setUsername(username);

		Account saved = accountRepository.save(acc);
		ResponseDTO response = new ResponseDTO();
		response.setAccountUsername(username);

		return response;
	}

	public List<ResponseDTO> getAll() {
		List<ResponseDTO> resp = new ArrayList<>();

		List<Account> allAccounts = accountRepository.findAll();
		for (Account acc : allAccounts) {
			ResponseDTO dto = new ResponseDTO();
			dto.setAccountUsername(acc.getUsername());

			resp.add(dto);
		}

		return resp;
	}
}

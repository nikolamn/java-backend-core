package com.niko.weblayer.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.niko.weblayer.dto.RegisterDTO;
import com.niko.weblayer.dto.ResponseDTO;
import com.niko.weblayer.service.AccountService;

import jakarta.validation.Valid;

@Validated
@RestController
@RequestMapping("/auth")
public class AuthController {

	private final AccountService accountService;

	public AuthController(AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping("/register")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseDTO register(@RequestBody @Valid RegisterDTO dto) {
		ResponseDTO resp = accountService.create(dto.getUsername());
		
		return resp;
	}

	@GetMapping("/all")
	@ResponseStatus(code = HttpStatus.OK)
	public List<ResponseDTO> getAllAccounts() {
		
		return accountService.getAll();
	}
}

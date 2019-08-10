package com.hcl.demand.supply.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demand.supply.dto.LoginReqDto;
import com.hcl.demand.supply.dto.LoginResDto;
import com.hcl.demand.supply.service.ILoginService;

@RestController

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })

@RequestMapping("/login")

public class LoginController {

	@Autowired

	ILoginService loginService;

	@PostMapping("")

	public ResponseEntity<LoginResDto> login(@RequestBody LoginReqDto loginDTO) {

		return new ResponseEntity<>(loginService.login(loginDTO), HttpStatus.OK);

	}

}

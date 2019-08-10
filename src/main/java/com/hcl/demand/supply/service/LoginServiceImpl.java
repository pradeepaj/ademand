package com.hcl.demand.supply.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.demand.supply.dto.LoginReqDto;
import com.hcl.demand.supply.dto.LoginResDto;
import com.hcl.demand.supply.entity.User;
import com.hcl.demand.supply.exception.UserNotFoundException;
import com.hcl.demand.supply.repository.IUserRepository;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private IUserRepository userRepository;
	

	@Override
	public LoginResDto login(LoginReqDto loginDTO) {
		User user = userRepository.findByUserNameAndPassword(loginDTO.getUserName(), loginDTO.getPassword());
	

		if (user != null ) {
			LoginResDto loginResDto = new LoginResDto();
			
			String msg = "Login Successfull";
			loginResDto.setRole(user.getRole());
			loginResDto.setMessage(msg);
			return loginResDto;

		} else {

			throw new UserNotFoundException();

		}

	}

}

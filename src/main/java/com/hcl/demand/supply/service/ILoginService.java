package com.hcl.demand.supply.service;

import com.hcl.demand.supply.dto.LoginReqDto;
import com.hcl.demand.supply.dto.LoginResDto;

public interface ILoginService {

	LoginResDto login(LoginReqDto loginDTO);

}

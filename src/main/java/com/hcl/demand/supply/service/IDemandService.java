package com.hcl.demand.supply.service;


import java.util.List;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.dto.SkillSet;
import com.hcl.demand.supply.entity.Demand;


public interface IDemandService {
	
	List<ResourceDto> fetchResource();

	Demand addDemand(Demand demand);


	List<ResourceDto> getRelevantResources(SkillSet skill);

}

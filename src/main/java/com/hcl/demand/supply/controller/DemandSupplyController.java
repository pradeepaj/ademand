package com.hcl.demand.supply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.dto.SkillSet;
import com.hcl.demand.supply.entity.Demand;
import com.hcl.demand.supply.service.IDemandService;

@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping
public class DemandSupplyController {

	@Autowired

	private IDemandService demandService;

	@PostMapping("/create")
	public ResponseEntity<Demand> addDemand(@RequestBody Demand demand) {
		return new ResponseEntity<>(demandService.addDemand(demand), HttpStatus.CREATED);

	}

	@GetMapping("/showResources")

	public List<ResourceDto> showResoure() {
		List<ResourceDto> resourceDtos = demandService.fetchResource();
		return resourceDtos;

	}

	@PostMapping("/demandsupply/{SkillSet}")

	public List<ResourceDto> demandByPM(@RequestBody SkillSet skillset) {

		List<ResourceDto> listofresources = demandService.getRelevantResources(skillset);

		return listofresources;
	}
	


}

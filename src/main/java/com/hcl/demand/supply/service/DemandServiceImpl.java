package com.hcl.demand.supply.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.demand.supply.dto.ResourceDto;
import com.hcl.demand.supply.dto.SkillSet;
import com.hcl.demand.supply.entity.Demand;
import com.hcl.demand.supply.entity.Resource;
import com.hcl.demand.supply.repository.IDemandRepository;
import com.hcl.demand.supply.repository.IResourceRepository;
import com.hcl.demand.supply.util.LevelConstant;

@Service
public class DemandServiceImpl implements IDemandService {
	@Autowired
	private IDemandRepository demandRepository;

	@Autowired
	private IResourceRepository resourceRepository;

	@Override
	public Demand addDemand(Demand demand) {
		return demandRepository.saveAndFlush(demand);
	}

	@Override
	public List<ResourceDto> fetchResource() {

		List<ResourceDto> resourceDtos = new ArrayList<>();
		List<Resource> resources = resourceRepository.findAllByStatus(LevelConstant.AVIALABLE);

		for (Resource resource : resources) {
			ResourceDto dto = new ResourceDto();
			dto.setEmpId(resource.getEmpId());
			dto.setMailId(resource.getMailId());
			dto.setName(resource.getName());
			dto.setExperience(resource.getExperience());
			dto.setLevel(resource.getLevel());
			dto.setLoctation(resource.getLocation());
			dto.setPrimarySkill(resource.getPrimarySkill());
			dto.setSecondarySkill(resource.getSecondarySkill());
			dto.setPhoneNumber(resource.getPhoneNumber());
			dto.setPhoneNumber(resource.getPhoneNumber());
			dto.setOtherSkill(resource.getOtherSkill());
			dto.setExperience(resource.getExperience());
			resourceDtos.add(dto);
		}

		return resourceDtos;

	}

	@Override

	public List<ResourceDto> getRelevantResources(SkillSet skill) {

		List<ResourceDto> dtos = new ArrayList<>();

		Resource rsc = new Resource();

		List<Resource> listResources = resourceRepository.findExactSkills(skill.getPrimaryskill(),
				skill.getSecondaryskill(), skill.getLocation(), skill.getExperience(), skill.getOtherskill(),
				skill.getLevelEnum());
		for (Resource resource : listResources) {

			ResourceDto dto = new ResourceDto();

			dto.setPercentagematch(100);

			dto.setEmpId(resource.getEmpId());

			dto.setMailId(resource.getMailId());

			dto.setName(resource.getName());

			dto.setExperience(resource.getExperience());

			dto.setLevel(resource.getLevel());

			dto.setLoctation(resource.getLocation());

			dto.setPrimarySkill(resource.getPrimarySkill());

			dto.setSecondarySkill(resource.getSecondarySkill());

			dto.setPhoneNumber(resource.getPhoneNumber());

			dto.setOtherSkill(resource.getOtherSkill());

			dto.setExperience(resource.getExperience());

			dto.setStatus(resource.getStatus());

			dtos.add(dto);

			return dtos;

		}

		if (listResources == null || listResources.size() == 0) {

			listResources = resourceRepository.findRecommendedSkills(skill.getPrimaryskill(), skill.getSecondaryskill(),
					skill.getLocation(), skill.getExperience(), skill.getOtherskill(), skill.getLevelEnum());

			for (Resource resource : listResources) {

				ResourceDto dto = new ResourceDto();

				dto.setEmpId(resource.getEmpId());

				dto.setMailId(resource.getMailId());

				dto.setName(resource.getName());

				dto.setExperience(resource.getExperience());

				dto.setLevel(resource.getLevel());

				dto.setLoctation(resource.getLocation());

				dto.setPrimarySkill(resource.getPrimarySkill());

				dto.setSecondarySkill(resource.getSecondarySkill());

				dto.setPhoneNumber(resource.getPhoneNumber());

				dto.setPhoneNumber(resource.getPhoneNumber());

				dto.setOtherSkill(resource.getOtherSkill());

				dto.setExperience(resource.getExperience());

				dto.setStatus(resource.getStatus());

				dtos.add(dto);

			}

			return dtos;

		}

		return null;

	}

}

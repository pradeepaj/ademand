package com.hcl.demand.supply.dto;

public class ResourceDto {

	private Long empId;
	private String name;
	private String mailId;
	private String loctation;
	private String primarySkill;
	private String secondarySkill;
	private String otherSkill;
	private int experience;
	private String status;
	private String phoneNumber;
	private String level;
	
	




	private int percentagematch;
	

	public int getPercentagematch() {
		return percentagematch;
	}

	public void setPercentagematch(int percentagematch) {
		this.percentagematch = percentagematch;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getLoctation() {
		return loctation;
	}

	public void setLoctation(String loctation) {
		this.loctation = loctation;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public String getOtherSkill() {
		return otherSkill;
	}

	public void setOtherSkill(String otherSkill) {
		this.otherSkill = otherSkill;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "ResourceDto [empId=" + empId + ", name=" + name + ", mailId=" + mailId + ", loctation=" + loctation
				+ ", primarySkill=" + primarySkill + ", secondarySkill=" + secondarySkill + ", otherSkill=" + otherSkill
				+ ", experience=" + experience + ", status=" + status + ", phoneNumber=" + phoneNumber + ", level="
				+ level + "]";
	}

}

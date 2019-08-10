package com.hcl.demand.supply.dto;



public class SkillSet {



	  private String primaryskill;

	  private String secondaryskill;

	  private String otherskill;

	  private String Location;

	  private int Experience;

	  private String levelEnum;

	  

	

	public String getLevelEnum() {

		return levelEnum;

	}

	public void setLevelEnum(String levelEnum) {

		this.levelEnum = levelEnum;

	}

	public String getOtherskill() {

		return otherskill;

	}

	public void setOtherskill(String otherskill) {

		this.otherskill = otherskill;

	}

	public String getPrimaryskill() {

		return primaryskill;

	}

	public void setPrimaryskill(String primaryskill) {

		this.primaryskill = primaryskill;

	}

	public String getSecondaryskill() {

		return secondaryskill;

	}

	public void setSecondaryskill(String secondaryskill) {

		this.secondaryskill = secondaryskill;

	}

	public String getLocation() {

		return Location;

	}

	public void setLocation(String location) {

		Location = location;

	}

	public int getExperience() {

		return Experience;

	}

	public void setExperience(int experience) {

		Experience = experience;

	}
}

	  

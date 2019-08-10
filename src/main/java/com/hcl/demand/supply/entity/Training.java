package com.hcl.demand.supply.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="training")
public class Training implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trainingId;
	private String technology;
	private String level;
	private int durationInWeek;
	public Training() {
		// TODO Auto-generated constructor stub
	}
	public long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getDurationInWeek() {
		return durationInWeek;
	}
	public void setDurationInWeek(int durationInWeek) {
		this.durationInWeek = durationInWeek;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

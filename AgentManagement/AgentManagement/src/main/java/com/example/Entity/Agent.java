package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="AgentManagement")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Agent 
{
	@Id 
	int aid;
	String aname;
	int asalary;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAsalary() {
		return asalary;
	}
	public void setAsalary(int asalary) {
		this.asalary = asalary;
	}
	
}

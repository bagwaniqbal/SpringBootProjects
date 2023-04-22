package com.example.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="InstrumentStore")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Instrument 

{
	@Id 		//Defines primary key
	int Iid;
	
	@NotNull
	String Iname;
	@NotNull
	String Itype;
	int price;
	public int getIid() {
		return Iid;
	}
	public void setIid(int iid) {
		Iid = iid;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	public String getItype() {
		return Itype;
	}
	public void setItype(String itype) {
		Itype = itype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

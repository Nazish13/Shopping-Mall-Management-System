package com.shopping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shop")
public class ShoppingMallEntity {
	private Integer id;
	private String madmin;
	private String mname;
	private String mlocation;
	private String mcategories;

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMadmin() {
		return madmin;
	}

	public void setMadmin(String madmin) {
		this.madmin = madmin;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMlocation() {
		return mlocation;
	}

	public void setMlocation(String mlocation) {
		this.mlocation = mlocation;
	}

	public String getMcategories() {
		return mcategories;
	}

	public void setMcategories(String mcategories) {
		this.mcategories = mcategories;
	}

	public ShoppingMallEntity(Integer id, String madmin, String mname, String mlocation, String mcategories) {
		this.id = id;
		this.madmin = madmin;
		this.mname = mname;
		this.mlocation = mlocation;
		this.mcategories = mcategories;
	}

	public ShoppingMallEntity() {
		
	}

	@Override
	public String toString() {
		return "ShoppingMallEntity [id=" + id + ", madmin=" + madmin + ", mname=" + mname + ", mlocation=" + mlocation
				+ ", mcategories=" + mcategories + "]";
	}
	
	

}

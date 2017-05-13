package com.poruki.backend.persistance.domain.backend;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.poruki.enums.PlansEnum;

@Entity
public class Plan implements Serializable{

	private static final long serialVersionUID=1L;
	
	@Id
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Plan(){
		
	}
	
	public Plan(PlansEnum plansEnum){
		this.id=plansEnum.getId();
		this.name=plansEnum.getPlanName();
	}
}

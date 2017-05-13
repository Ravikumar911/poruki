package com.poruki.enums;

public enum PlansEnum {
	BASIC(1, "BASIC"), PRO(2, "Pro");
	private final int id;
	private final String planName;

	public int getId() {
		return id;
	}

	public String getPlanName() {
		return planName;
	}

	PlansEnum(int id, String planName) {
		this.id = id;
		this.planName = planName;
	}
}

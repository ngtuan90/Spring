package com.edwin.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Exercise {
	private String activity;
	@Range(min = 1, max = 120)
	private int minutes;

	@NotNull
	public String getActivity() {
		return activity;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}

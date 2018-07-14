package com.edwin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edwin.model.Activity;

@Service("exersiceService")
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see com.edwin.service.ExerciseService#findAlActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activites = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("Run");
		activites.add(run);

		Activity bike = new Activity();
		bike.setDesc("Bike");
		activites.add(bike);

		Activity swim = new Activity();
		swim.setDesc("Swim");
		activites.add(swim);
		return activites;
	}
}

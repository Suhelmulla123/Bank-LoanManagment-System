package com.system.app.service;

import com.system.app.model.FloatingRates;

public interface FloatingrateService {

	public FloatingRates addFloatingrates(FloatingRates floatingrates);
	public FloatingRates updtaeFloatingrates(FloatingRates floatingrates, int No);
	public void deleteFloatingrates(int No);
}

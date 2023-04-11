package com.system.app.service;

import com.system.app.model.FixedRates;

public interface FixedratesService {
	public FixedRates addFixedratesloan(FixedRates fixedrates);
	public FixedRates updateFixedrates(FixedRates fixedrates,int No);
	public void deleteFixedrates(int No);

}

package com.pavan.dao;

import com.pavan.model.Patient;

public interface Physician_dao {

	public void addPhysician(Patient patient);
	
	public Patient getPhysicianDetails();

}

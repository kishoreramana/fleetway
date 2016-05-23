package com.fleetway.interview.service;

import java.util.List;

import com.fleetway.interview.model.DataEntities;
import com.fleetway.interview.model.DataEntity;
import com.fleetway.interview.model.ObjectFactory;

public class ApplicationConfigService {

	private DataEntities dataEntities;

	public ApplicationConfigService() {
		ObjectFactory objectFactory = new ObjectFactory();

		dataEntities = objectFactory.createDataEntities();

		DataEntity dataEntity1 = objectFactory.createDataEntity();

		dataEntity1.setId("1");
		dataEntity1.setName("Number 1");
		dataEntity1.setDescription(null);
		dataEntity1.setQuantity(1);

		DataEntity dataEntity2 = objectFactory.createDataEntity();

		dataEntity1.setId("2");
		dataEntity1.setName("Number 2");
		dataEntity1.setDescription(null);
		dataEntity1.setQuantity(2);

		dataEntities.getEntities().add(dataEntity1);
		dataEntities.getEntities().add(dataEntity2);
	}

	public List<DataEntity> getAllEntities() {
		return  dataEntities.getEntities();
	}
}

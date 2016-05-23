package com.fleetway.interview.service;

import java.util.List;

import com.fleetway.interview.model.DataEntities;
import com.fleetway.interview.model.DataEntity;
import com.fleetway.interview.model.ObjectFactory;
import com.fleetway.interview.model.Status;

public class ApplicationConfigService {

	private DataEntities dataEntities;
	private ObjectFactory objectFactory;

	public ApplicationConfigService() {
		objectFactory = new ObjectFactory();

		dataEntities = objectFactory.createDataEntities();

		DataEntity dataEntity1 = objectFactory.createDataEntity();

		dataEntity1.setId("1");
		dataEntity1.setName("Number 1");
		dataEntity1.setDescription(null);
		dataEntity1.setQuantity(1);

		DataEntity dataEntity2 = objectFactory.createDataEntity();

		dataEntity2.setId("2");
		dataEntity2.setName("Number 2");
		dataEntity2.setDescription(null);
		dataEntity2.setQuantity(2);

		dataEntities.getEntities().add(dataEntity1);
		dataEntities.getEntities().add(dataEntity2);
	}

	public List<DataEntity> getAllEntities() {
		return  dataEntities.getEntities();
	}
	
	public Status addEntity(DataEntity entity) {
		dataEntities.getEntities().add(entity);
		Status status = objectFactory.createStatus();
		status.setSuccess(true);
		return status;
	}
}

package com.fleetway.interview;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fleetway.interview.model.DataEntity;
import com.fleetway.interview.service.ApplicationConfigService;

@Path("/entities")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ApplicationConfig{

	private ApplicationConfigService appConfigService = new ApplicationConfigService();
		
	@GET
	@Path("/list")
	public List<DataEntity> getAllEntities() {
		return appConfigService.getAllEntities();
	}
}
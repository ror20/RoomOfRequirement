package com.ror.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ror.dao.RORDAO;
import com.ror.dao.impl.RORDAOImpl;

@Path("rest")
public class RORRest {
	

	@GET
	@Path("/sample")
	public String userAvailabilityService() {
		RORDAO rorDAO = new RORDAOImpl();
		return rorDAO.sampleDAOCheck();
	}
	

}

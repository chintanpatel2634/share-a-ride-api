package com.cs.iit.project.sar.exception.mapper;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.cs.iit.project.sar.exception.FieldDataInvalidException;
import com.cs.iit.project.sar.repositories.response.ExceptionResponseMaker;

@Provider
public class FieldDataInvalidExceptionMapper implements ExceptionMapper<FieldDataInvalidException> {

	private UriInfo uriInfo;
	
	public FieldDataInvalidExceptionMapper(@Context UriInfo uriInfo) {
		this.uriInfo = uriInfo;
	}
	
	@Override
	public Response toResponse(FieldDataInvalidException exception) {
		return ExceptionResponseMaker.create(exception.getMessage(), 
												Status.BAD_REQUEST, 
													"/" + uriInfo.getPath());
	}

}

package com.cs.iit.sar.exception.mapper;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.cs.iit.sar.exception.ExceptionResponseMaker;

public class NullPointerExceptionMapper implements ExceptionMapper<NullPointerException>{

	private UriInfo uriInfo;
	
	public NullPointerExceptionMapper(@Context UriInfo uriInfo) {
		this.uriInfo = uriInfo;
	}
	
	@Override
	public Response toResponse(NullPointerException exception) {
		return ExceptionResponseMaker.create(exception.getMessage(),
												Status.BAD_REQUEST,
													"/" + uriInfo.getPath());
	}


}

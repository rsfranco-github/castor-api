package com.castor.empleados.response;

import com.castor.empleados.util.Constants;

public class CastorAPIResponse {
	
	private String code;
	private String message;
	private Object response;
	
	public CastorAPIResponse() {
		this.code=Constants.HTTP_STATUS_200;
		this.message=Constants.SUCCESS;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}

}

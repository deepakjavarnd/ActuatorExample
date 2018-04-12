package com.javarnd.app.springactuatorexample;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;
@Component
public class CustomEndPoint implements Endpoint<String> {

	@Override
	public String getId() {
		
		return "customEndPoint";
	}

	@Override
	public String invoke() {
		
		return "This is a custom rest end point";
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

	@Override
	public boolean isSensitive() {
		return false;
	}

}

package com.axis.flowchartservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlowchartNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -5439362929938820431L;

	public FlowchartNotFoundException(String message) {
        super(message);
    }

    public FlowchartNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}


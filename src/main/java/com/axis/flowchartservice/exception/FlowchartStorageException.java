package com.axis.flowchartservice.exception;

public class FlowchartStorageException extends RuntimeException {
    

	private static final long serialVersionUID = 2806913935594753704L;

	public FlowchartStorageException(String message) {
        super(message);
    }

    public FlowchartStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
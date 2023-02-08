package com.axis.flowchartservice.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Flowchart {
	
	@Id
	@GeneratedValue
	private int flowchartId;
	private String flowchartName;
    private String flowchartType;
    @Lob
    private byte[] flowchartFile;
	
    public Flowchart() {
		
	}

	public Flowchart(String flowchartName, String flowchartType, byte[] flowchartFile) {
		super();
		this.flowchartName = flowchartName;
		this.flowchartType = flowchartType;
		this.flowchartFile = flowchartFile;
	}

	public int getFlowchartId() {
		return flowchartId;
	}

	public void setFlowchartId(int flowchartId) {
		this.flowchartId = flowchartId;
	}

	public String getFlowchartName() {
		return flowchartName;
	}

	public void setFlowchartName(String flowchartName) {
		this.flowchartName = flowchartName;
	}

	public String getFlowchartType() {
		return flowchartType;
	}

	public void setFlowchartType(String flowchartType) {
		this.flowchartType = flowchartType;
	}

	public byte[] getFlowchartFile() {
		return flowchartFile;
	}

	public void setFlowchartFile(byte[] flowchartFile) {
		this.flowchartFile = flowchartFile;
	}

	@Override
	public String toString() {
		return "Flowchart [flowchartId=" + flowchartId + ", flowchartName=" + flowchartName + ", flowchartType="
				+ flowchartType + ", flowchartFile=" + Arrays.toString(flowchartFile) + "]";
	}
    
    
    

	

}

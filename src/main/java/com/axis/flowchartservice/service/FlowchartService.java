package com.axis.flowchartservice.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.axis.flowchartservice.entity.Flowchart;

public interface FlowchartService {

	Flowchart getFlowchartById(int flowchartId);
	List<Flowchart> getAllFlowchart();
	void addFlowchart(MultipartFile file);
}

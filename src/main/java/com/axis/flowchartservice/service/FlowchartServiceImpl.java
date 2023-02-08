package com.axis.flowchartservice.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.axis.flowchartservice.entity.Flowchart;
import com.axis.flowchartservice.exception.FlowchartNotFoundException;
import com.axis.flowchartservice.exception.FlowchartStorageException;
import com.axis.flowchartservice.repository.FlowchartRepository;

@Service
public class FlowchartServiceImpl implements FlowchartService {

	@Autowired
	private FlowchartRepository flowchartRepository;
	
	@Override
	public Flowchart getFlowchartById(int flowchartId) {
		return flowchartRepository.findById(flowchartId).orElseThrow(() 
				 -> new FlowchartNotFoundException("Document do not Exist with Document ID: " + flowchartId));
		
	}
	@Override
	public List<Flowchart> getAllFlowchart() {
		
		return (List<Flowchart>) flowchartRepository.findAll(); 
	}

	@Override
	public void addFlowchart(MultipartFile file) {

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		try {
			if(fileName.contains("..")) {
				throw new FlowchartStorageException(" Invalid Path" + fileName);
			}
			Flowchart flowchart = new Flowchart(fileName, file.getContentType(), file.getBytes());
			flowchartRepository.save(flowchart);
		} catch(IOException e) {
			throw new FlowchartStorageException("Could not store file " + fileName + ". Please try again!");
		}
		
	}

}

package com.axis.flowchartservice.controller;

import java.util.Base64;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.axis.flowchartservice.entity.Flowchart;
import com.axis.flowchartservice.service.FlowchartService;

@CrossOrigin("http://localhost:3000/")
@RestController
public class FlowchartController {

	@Autowired
    private FlowchartService flowchartService;

    @GetMapping("/view-document/{flowchartId}")
    public ResponseEntity<byte[]> getFlowchartById(@PathVariable int flowchartId) {
		Flowchart flow = flowchartService.getFlowchartById(flowchartId);
		return new ResponseEntity<>(Base64.getEncoder().encode(flow.getFlowchartFile()), HttpStatus.OK);
	}
    
    @GetMapping("/documents")
    public List<Flowchart> getAllFlowchart() {
       return flowchartService.getAllFlowchart();
    }

    
    /*@GetMapping("/viewflowchart/{flowchartId}")
    public ResponseEntity<Resource> getFlowchartById(@PathVariable int flowchartId) {
        // Load file from database
    	Flowchart flow = flowchartService.getFlowchartById(flowchartId);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(flow.getFlowchartType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + flow.getFlowchartName() + "\"")
                .body(new ByteArrayResource(flow.getFlowchartType()));
    }*/

   
    @PostMapping("/uploaddocument")
	public ResponseEntity<String> addFlowchart(@RequestParam("file") MultipartFile file) {
		flowchartService.addFlowchart(file);
		return new ResponseEntity<>("Flowchart Uploaded Successfully", HttpStatus.OK);
	}
}

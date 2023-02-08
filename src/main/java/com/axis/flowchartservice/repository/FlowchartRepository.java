package com.axis.flowchartservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.flowchartservice.entity.Flowchart;

@Repository
public interface FlowchartRepository extends JpaRepository<Flowchart, Integer> {

}

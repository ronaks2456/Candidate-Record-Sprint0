package com.sprint.candidaterecord.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.candidaterecord.model.Candidate;
import com.sprint.candidaterecord.service.CandidateService;

import ch.qos.logback.classic.Logger;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/candidate")
public class CandidateController {

	@Autowired
	CandidateService cs;
	
	Logger logger= (Logger) LoggerFactory.getLogger(CandidateController.class);
	
	
	@GetMapping("/all-candidates")
	public List<Candidate> allCandidates()
	{
		logger.trace("All Candidates List method accessed");
		return cs.getAllCandidates();
	}
}
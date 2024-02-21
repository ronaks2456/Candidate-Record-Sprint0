package com.sprint.candidaterecord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.candidaterecord.model.Candidate;
import com.sprint.candidaterecord.repository.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	CandidateRepository cr;
	
	@Override
	public List<Candidate> getAllCandidates() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

}

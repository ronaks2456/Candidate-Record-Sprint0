package com.sprint.candidaterecord.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.sprint.candidaterecord.model.Candidate;
import com.sprint.candidaterecord.repository.CandidateRepository;



//@RunWith(SpringRunner.class)
@SpringBootTest
public class CandidateServiceImplTest {
	
	
	@MockBean
	CandidateRepository repo;
	
	@Autowired
	CandidateService candidateService;
	
	@Test
	public void getAllCandidatesTest() {
		List<Candidate> candidates = Arrays.asList(new Candidate(1, 123 , "John", 99, 1, "14-02-2024 19:00"), new Candidate(2, 1223 , "Joe", 9, 13, "16-02-2024 19:00"));
		Mockito.when(repo.findAll()).thenReturn(candidates);
		assertEquals(2, candidateService.getAllCandidates().size());
		System.out.println("Successful in getting candidate list");
	}

}

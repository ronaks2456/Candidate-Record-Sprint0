package com.sprint.candidaterecord.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.candidaterecord.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}

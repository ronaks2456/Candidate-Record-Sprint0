package com.sprint.candidaterecord.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="candidate")
public class Candidate {
	
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int recId;
		private int candidateNo;
		private String candidateName;
		private int score;
		private int rank1;
		private String updateDate;
		
		public Candidate() {
			super();
		}

		public Candidate(int recId, int candidateNo, String candidateName, int score, int rank1, String updateDate) {
			super();
			this.recId = recId;
			this.candidateNo = candidateNo;
			this.candidateName = candidateName;
			this.score = score;
			this.rank1 = rank1;
			this.updateDate = updateDate;
		}
		
		
		public int getRecId() {
			return recId;
		}
		public void setRecId(int recId) {
			this.recId = recId;
		}
		public int getCandidateNo() {
			return candidateNo;
		}
		public void setCandidateNo(int candidateNo) {
			this.candidateNo = candidateNo;
		}
		public String getCandidateName() {
			return candidateName;
		}
		public void setCandidateName(String candidateName) {
			this.candidateName = candidateName;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public int getrank1() {
			return rank1;
		}
		public void setrank1(int rank1) {
			this.rank1 = rank1;
		}
		public String getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}
		@Override
		public String toString() {
			return "Candidate [recId=" + recId + ", candidateNo=" + candidateNo + ", candidateName=" + candidateName
					+ ", score=" + score + ", rank1=" + rank1 + ", updateDate=" + updateDate + "]";
		}
		
}

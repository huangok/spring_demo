package org.version.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;
import org.version.service.CsVisitService;


public class CsVisit  {


	private String companyId;
	private String projectId;
	private String customerId;
	private String empolyeeId;
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getEmpolyeeId() {
		return empolyeeId;
	}
	public void setEmpolyeeId(String empolyeeId) {
		this.empolyeeId = empolyeeId;
	}
	@Override
	public String toString() {
		return "CsVisit [companyId=" + companyId + ", projectId=" + projectId + ", customerId=" + customerId
				+ ", empolyeeId=" + empolyeeId + "]";
	}
	
	
}

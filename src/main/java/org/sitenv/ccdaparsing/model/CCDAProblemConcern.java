package org.sitenv.ccdaparsing.model;

import java.util.ArrayList;

public class CCDAProblemConcern extends CCDAXmlSnippet{

	private ArrayList<CCDAII>     		templateId;
	private CCDACode         	   		concernCode;
	private CCDACode  					statusCode;
	private CCDAEffTime      			effTime;
	private ArrayList<CCDAProblemObs>  	problemObservations;
	private ArrayList<CCDADataElement> referenceTexts;
	
	public CCDAProblemConcern()
	{
		problemObservations = new ArrayList<CCDAProblemObs>();
	}

	public ArrayList<CCDAII> getTemplateId() {
		return templateId;
	}

	public void setTemplateId(ArrayList<CCDAII> templateId) {
		this.templateId = templateId;
	}

	public CCDACode getConcernCode() {
		return concernCode;
	}

	public void setConcernCode(CCDACode concernCode) {
		this.concernCode = concernCode;
	}

	public CCDACode getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(CCDACode statusCode) {
		this.statusCode = statusCode;
	}

	public CCDAEffTime getEffTime() {
		return effTime;
	}

	public void setEffTime(CCDAEffTime effTime) {
		this.effTime = effTime;
	}

	public ArrayList<CCDAProblemObs> getProblemObservations() {
		return problemObservations;
	}

	public void setProblemObservations(ArrayList<CCDAProblemObs> problemObservations) {
		this.problemObservations = problemObservations;
	}
	
	public ArrayList<CCDADataElement> getReferenceTexts() {
		if(this.referenceTexts == null)
		{
			this.referenceTexts = new ArrayList<CCDADataElement>();
		}
		
		return referenceTexts;
	}

	public void setReferenceTexts(ArrayList<CCDADataElement> referenceTexts) {
		this.referenceTexts = referenceTexts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((concernCode == null) ? 0 : concernCode.hashCode());
		result = prime * result + ((effTime == null) ? 0 : effTime.hashCode());
		result = prime
				* result
				+ ((problemObservations == null) ? 0 : problemObservations
						.hashCode());
		result = prime * result
				+ ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime * result
				+ ((templateId == null) ? 0 : templateId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CCDAProblemConcern other = (CCDAProblemConcern) obj;
		if (concernCode == null) {
			if (other.concernCode != null)
				return false;
		} else if (!concernCode.equals(other.concernCode))
			return false;
		if (effTime == null) {
			if (other.effTime != null)
				return false;
		} else if (!effTime.equals(other.effTime))
			return false;
		if (problemObservations == null) {
			if (other.problemObservations != null)
				return false;
		} else if (!problemObservations.equals(other.problemObservations))
			return false;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		if (templateId == null) {
			if (other.templateId != null)
				return false;
		} else if (!templateId.equals(other.templateId))
			return false;
		return true;
	}
	
	
}

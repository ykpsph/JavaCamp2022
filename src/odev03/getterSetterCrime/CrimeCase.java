package odev03.getterSetterCrime;

public class CrimeCase {
	// attributes - fields
	private int caseId;
	private String assignedOfficerBadgeNo;
	private String crimeDesc;
	private String occurredLocation;
	private String suspectFullName;
	private String suspectHomeAddress;
	private boolean suspectArmed;

	// constructor
	public CrimeCase(int caseId, String assignedOfficerBadgeNo, String crimeDesc, String occurredLocation,
			String suspectFullName, String suspectHomeAddress, boolean suspectArmed) {
		this.setCaseId(caseId);
		this.setAssignedOfficerBadgeNo(assignedOfficerBadgeNo);
		this.setCrimeDesc(crimeDesc);
		this.setOccuredLocation(occurredLocation);
		this.setSuspectFullName(suspectFullName);
		this.setSuspectHomeAddress(suspectHomeAddress);
		this.setSuspectArmed(suspectArmed);
	}
	
  

//	"white", 
//	true

	public int getCaseId() {
		return caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public String getAssignedOfficerBadgeNo() {
		return assignedOfficerBadgeNo;
	}

	public void setAssignedOfficerBadgeNo(String assignedOfficerBadgeNo) {
		this.assignedOfficerBadgeNo = assignedOfficerBadgeNo;
	}

	public String getOccuredLocation() {
		return occurredLocation;
	}

	public void setOccuredLocation(String occurredLocation) {
		this.occurredLocation = occurredLocation;
	}


	public String getSuspectFullName() {
		return suspectFullName;
	}

	public void setSuspectFullName(String suspectFullName) {
		this.suspectFullName = suspectFullName;
	}

	public String getCrimeDesc() {
		return crimeDesc;
	}

	public void setCrimeDesc(String crimeDesc) {
		this.crimeDesc = crimeDesc;
	}

	public String getSuspectHomeAddress() {
		return suspectHomeAddress;
	}

	public void setSuspectHomeAddress(String suspectHomeAddress) {
		this.suspectHomeAddress = suspectHomeAddress;
	}

	public boolean isSuspectArmed() {
		return suspectArmed;
	}

	public void setSuspectArmed(boolean suspectArmed) {
		this.suspectArmed = suspectArmed;
	}
}

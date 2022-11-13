package odev03.getterSetterCrime;

public class Main {
	public static void main(String[] args) {
		CrimeCase crimeCase = new CrimeCase(
				1902, 
				"NYPD0219", 
				"homocide", 
				"607 Emerson Hotel", 
				"Deacon WEST",
				"902 flora street building 3", 
				true
				);
		
//		int caseId, String assignedOfficerBadgeNo, String crimeDesc, String occurredLocation,
//		String suspectFullName, String suspectHomeAddress, boolean suspectArmed
		CaseManager caseManager = new CaseManager();
		caseManager.CreateCase(crimeCase);
	}
}

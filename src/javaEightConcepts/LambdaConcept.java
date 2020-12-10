package javaEightConcepts;

public class LambdaConcept {

	//SAM:- Single Abstract Method concept
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaInterface li = (String username, String pword) -> System.out.println("Enter Username: " + username + " " + "Entered Passsword: " +pword);
	
		li.loginCred("QA", "QA@123");
		
		LambdaInterface li2 = (String username, String pword) -> System.out.println("Enter Username: " + username.toLowerCase() + " " + "Entered Passsword: " +pword.toUpperCase());

		li2.loginCred("QAAAA", "WASA");
	}
}

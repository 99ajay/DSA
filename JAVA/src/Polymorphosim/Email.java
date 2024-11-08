package Polymorphosim;

public class Email {
	public void sendEmail(String to, String sub, String message) {
		System.out.println("Welcome email sent");
	}
	public void sendEmail(String to, String sub, String message, String otp) {
		System.out.println("otp is sent");
	}
	public static void main(String[] args) {
//	Email email =  new Email();
//	email.sendEmail("averma1@cogitate.us", "welcome", "welcome to IBM");
//	email.sendEmail("averma1@cogitate.us", "otp", "your otp is ", "12345");
		try {
		    // Trying to withdraw money
		    int withdrawalAmount = 500; // Let's say you want to withdraw $500.
		    int balance = 300;          // But you only have $300 in your account.

		    if (withdrawalAmount > balance) {
		        throw new Exception("Not enough balance.");
		    }

		    System.out.println("Withdrawal successful!"); // This runs if there's no error.
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage()); // Catches any problems that arise.
		} finally {
		    System.out.println("Thank you for using the ATM."); // This always runs, regardless of an error.
		}



	}

}

package emailapp;

import java.util.Random;
import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	
	//Constructor to receive the first name and last name
	public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//Call method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department : " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Password : " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"." +companySuffix;
		//System.out.println("Your email is: " + email);
		}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
		Scanner in= new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if (depChoice ==2 ) {return "dev";}
		else if (depChoice ==3) {return "Acct";}
		else {return "";}
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for(int i =0; i<length;i++) {
			int index = random.nextInt(passwordSet.length());
			char randomChar = passwordSet.charAt(index);
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		return randomString;
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAtlernateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getChangePassword() {return password;}
	
	public String showInfo() {
		return "Display Name: " + firstName + "\n" + lastName +
				"Company Email: " + email + "\n"+
				"Maiolbox Capacity: " + mailboxCapacity + "mb";
	}
}

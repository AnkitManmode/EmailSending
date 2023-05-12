package com.concepts;

public class App {
public static void main(String[] args) {
	GEmailSender gEmailSender = new GEmailSender();
	String to = "sarangw29@gmail.com";
	String from ="ankitmanmode123@gmail.com";
	String subject = "Sending email using Gmail";
	String text = "This is a example of email send using gmail and java program without less secure app";
	boolean b = gEmailSender.sendemail(to, from, subject,text);
	if(b) {
		System.out.println("Email is send succeesfully");
	}else {
		System.out.println("There is a problem in sending email");
	}
}
}

package com.usecases.java;

abstract class Notification {

	public abstract void send(String message);

	public void status() {
		System.out.println("Notification sent successfully.\n");
	}
}

class EmailNotification extends Notification {
	public void send(String message) {
		System.out.println("Sending Email: " + message);
		status();
	}
}

class SMSNotification extends Notification {
	public void send(String message) {
		System.out.println("Sending SMS: " + message);
		status();
	}
}

class PushNotification extends Notification {
	public void send(String message) {
		System.out.println("Sending Push Notification: " + message);
		status();
	}
}

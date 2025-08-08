package com.usecases.java;

public class NotificationMain {
	public static void main(String[] args) {
        Notification email = new EmailNotification();
        email.send("Your bill is generated.");

        Notification sms = new SMSNotification();
        sms.send("Your OTP is 123456.");

        Notification push = new PushNotification();
        push.send("New offer available on your app!");
    }

}

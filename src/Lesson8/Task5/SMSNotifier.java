package Lesson8.Task5;

public class SMSNotifier implements Notifier {
    private String phoneNumber;

    public SMSNotifier(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message){
        System.out.println("Получатель: " + phoneNumber);
        System.out.println("Уведомление: \"" + message + "\" отправлено по СМС\n");
    }
}
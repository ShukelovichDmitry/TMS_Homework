package Lesson8.Task5;

public class EmailNotifier implements Notifier {
    private String emailAddress;

    public EmailNotifier(String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendNotification(String message){
        System.out.println("Получатель: " + emailAddress);
        System.out.println("Уведомление: \"" + message + "\" отправлено по Email\n");
    }
}

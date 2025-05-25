package Lesson8.Task5;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier){
        this.notifier = notifier;
    }

    public void sendNotification(String message){
        notifier.sendNotification(message);
    }
}

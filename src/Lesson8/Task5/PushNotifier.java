package Lesson8.Task5;

public class PushNotifier implements Notifier {
    @Override
    public void sendNotification(String message){
        System.out.println("Push-уведомление: \"" + message + "\" отправлено\n");
    }
}

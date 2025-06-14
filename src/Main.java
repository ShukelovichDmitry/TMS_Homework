import Lesson8.Homework1.Clothing;
import Lesson8.Homework1.Electronics;
import Lesson8.Homework1.Food;
import Lesson8.Task5.EmailNotifier;
import Lesson8.Task5.NotificationService;
import Lesson8.Task5.PushNotifier;
import Lesson8.Task5.SMSNotifier;

public class Main {

    public static void main(String[] args){
        String message = "Сообщение";
        new NotificationService(new EmailNotifier("notifier@mail.ru")).sendNotification(message);
        new NotificationService(new PushNotifier()).sendNotification(message);
        new NotificationService(new SMSNotifier("+375 44 123-45-67")).sendNotification(message);

        new Electronics("Смартфон", 400.0).showFinalPrice();
        new Clothing("Куртка", 50).showFinalPrice();
        new Food("Хлеб", 10.0).showFinalPrice();
    }
}

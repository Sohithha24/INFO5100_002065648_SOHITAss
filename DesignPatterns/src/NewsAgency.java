import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifySubscribers(String news) {
        for (Observer observer : subscribers) {
            observer.update(news);
        }
    }
}


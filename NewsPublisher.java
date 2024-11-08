package lab5_var7;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the Subject interface.
 * Maintains a list of observers and notifies them of new news updates.
 */
public class NewsPublisher implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    /**
     * Publishes news and notifies all attached observers.
     * @param news The news message to publish.
     */
    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifyObservers(news);
    }
}

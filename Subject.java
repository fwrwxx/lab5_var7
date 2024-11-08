package lab5_var7;

/**
 * Interface representing a Subject in the Observer pattern.
 * A Subject maintains a list of observers and notifies them of any state changes.
 */
public interface Subject {
    /**
     * Attaches an observer to the subject.
     * @param observer The observer to attach.
     */
    void attach(Observer observer);

    /**
     * Detaches an observer from the subject.
     * @param observer The observer to detach.
     */
    void detach(Observer observer);

    /**
     * Notifies all attached observers with the given news.
     * @param news The news message to send to observers.
     */
    void notifyObservers(String news);
}

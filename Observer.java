package lab5_var7;

/**
 * Interface representing an Observer in the Observer pattern.
 * Observers receive updates from the Subject whenever there is a state change.
 */
public interface Observer {
    /**
     * Updates the observer with the latest news.
     * @param news The news message received from the subject.
     */
    void update(String news);
}

package lab5_var7;

/**
 * Concrete implementation of the Observer interface.
 * Represents a reader subscriber who receives news updates.
 */
public class ReaderSubscriber implements Observer {
    private final String name;

    /**
     * Constructs a ReaderSubscriber with a specified name.
     * @param name The name of the reader.
     */
    public ReaderSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}

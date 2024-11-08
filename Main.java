package lab5_var7;

/**
 * Demonstrates the use of the Observer pattern with a news publishing system.
 * Attaches different types of observers to a NewsPublisher and notifies them of news updates.
 */
public class Main {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        Observer reader1 = new ReaderSubscriber("John");
        Observer reader2 = new ReaderSubscriber("Anna");
        Observer mediaAgency = new MediaAgencySubscriber("Global News");

        // Attach observers to the news publisher
        newsPublisher.attach(reader1);
        newsPublisher.attach(reader2);
        newsPublisher.attach(mediaAgency);

        // Publish a news update
        newsPublisher.publishNews("New Observer message!");

        // Detach an observer and publish another news update
        newsPublisher.detach(reader2);
        newsPublisher.publishNews("Breaking News: Observer!");
    }
}

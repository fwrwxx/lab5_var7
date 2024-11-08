package lab5_var7;

/**
 * Concrete implementation of the Observer interface.
 * Represents a media agency subscriber that broadcasts received news updates.
 */
public class MediaAgencySubscriber implements Observer {
    private final String agencyName;

    /**
     * Constructs a MediaAgencySubscriber with a specified agency name.
     * @param agencyName The name of the media agency.
     */
    public MediaAgencySubscriber(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String news) {
        System.out.println(agencyName + " received news for broadcasting: " + news);
    }
}

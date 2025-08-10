package CabBooking.Model;

// SRP: Represents a Rider entity only
public class Rider {
    private String id;
    private String name;

    public Rider(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}

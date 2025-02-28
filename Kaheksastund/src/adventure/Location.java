package adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private int locationId;
    private String description;
    private Map<String, Integer> exits;
    //String on suund, Integer on uue locationi ID

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }
    public void addExit(String direction, int location) {
        exits.put(direction,location);
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }
}

// EventManagementSystem.java
import java.util.ArrayList;

public class EventManagementSystem {
    private ArrayList<Event> events;
    private ArrayList<Organizer> organizers;
    private ArrayList<Attendee> attendees;

    public EventManagementSystem() {
        this.events = new ArrayList<>();
        this.organizers = new ArrayList<>();
        this.attendees = new ArrayList<>();
    }

    // Methods for managing events, organizers, and attendees

    public static void main(String[] args) {
        EventManagementSystem eventSystem = new EventManagementSystem();

        // Example: Creating an event
        Event event1 = new Event();
        event1.setEventName("Tech Conference");
        event1.setDate("2023-10-10");
        event1.setLocation("Conference Center");

        // Example: Creating an organizer
        Organizer organizer1 = new Organizer();
        organizer1.setOrganizerName("Tech Events Inc.");
        organizer1.setContactNumber("+1234567890");

        // Example: Creating an attendee
        Attendee attendee1 = new Attendee();
        attendee1.setAttendeeName("John Doe");
        attendee1.setEmail("john.doe@example.com");

        // Adding created entities to the system
        eventSystem.events.add(event1);
        eventSystem.organizers.add(organizer1);
        eventSystem.attendees.add(attendee1);

        // Additional logic for managing events, organizers, and attendees can be added here
    }
}

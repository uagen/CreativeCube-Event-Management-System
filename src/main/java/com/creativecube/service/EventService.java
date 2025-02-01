// EventService.java
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private UserRepository userRepository;

    public void createEvent(Event event, String clientEmail) {
        Client client = (Client) userRepository.findByEmail(clientEmail).orElseThrow();
        event.setClient(client);
        eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}

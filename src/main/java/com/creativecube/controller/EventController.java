// EventController.java
@Controller
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public String listEvents(Model model) {
        model.addAttribute("events", eventService.getAllEvents());
        return "events";
    }

    @PostMapping("/event/submit")
    public String submitEvent(@ModelAttribute Event event, Principal principal) {
        String clientEmail = principal.getName();
        eventService.createEvent(event, clientEmail);
        return "redirect:/events";
    }
}

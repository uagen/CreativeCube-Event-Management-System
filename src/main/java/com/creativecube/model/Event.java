// Event.java
@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventType;
    private LocalDate eventDate;
    private int guestCount;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Vendor vendor;
}

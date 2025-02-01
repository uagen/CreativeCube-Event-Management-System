/ EventRepository.java
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByClientEmail(String email);
}

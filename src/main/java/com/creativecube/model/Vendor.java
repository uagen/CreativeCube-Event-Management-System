// Vendor.java
@Entity
@Data
public class Vendor extends User {
    private String serviceType;
    private double rate;
    private boolean isApproved = false;
}

package Example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="Booking")

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "busId")
    private Bus bus;

    @Column(name="Departure")
    private String departure;

    @Column(name="booking_date")
    private Date date;

    public long getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public String getDeparture() {
        return departure;
    }

    public Date getDate() {
        return date;
    }
}

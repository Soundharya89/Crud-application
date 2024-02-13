package Example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long busId;

    @Column(name = "Bus_no")
    private String busNo;

    @Column(name="seats")
    private int seats;
    public long getBusId() {
        return busId;
    }

    public String getBusNo() {
        return busNo;
    }

    public int getSeats() {
        return seats;
    }

}

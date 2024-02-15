package Example.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

import java.util.Date;

public class BookingDto {

    @JsonProperty("bookingId")
    private long bookingId;

    @JsonProperty("Departure")
    private String departure;

    @JsonProperty("booking_date")
    private Date date;

    public String getDeparture() {
        return departure;
    }

    public Date getDate() {
        return date;
    }
}

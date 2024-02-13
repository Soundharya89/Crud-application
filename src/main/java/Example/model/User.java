package Example.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long userId;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "email")
        private String email;

}


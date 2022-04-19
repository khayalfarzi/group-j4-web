package az.iktlab.groupj4web.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person", schema = "group_j4")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long id;

    @Column(name = "p_name",
            length = 32,
            nullable = false,
            unique = true)
    private String name;

    @Column(name = "p_surname")
    private String surname;

    @Column(name = "p_age")
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(name = "p_gender")
    private Gender gender;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    enum Gender {
        MALE, FEMALE
    }
}
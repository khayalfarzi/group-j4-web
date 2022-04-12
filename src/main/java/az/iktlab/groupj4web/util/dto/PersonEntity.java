package az.iktlab.groupj4web.util.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    private Long id;
    private String name;
    private String surname;
    private int age;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

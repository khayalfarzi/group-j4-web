package az.iktlab.groupj4web.util.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    Long id;
    int age;
    String name;
    String surname;
}

package az.iktlab.groupj4web.util.dto;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        PersonEntity personEntity = new PersonEntity(1L,
                "Name",
                "Surname", 23,
                LocalDateTime.now(),
                LocalDateTime.now());

        PersonDto dto = new PersonDto();
        dto.setAge(personEntity.getAge());
        dto.setName(personEntity.getName());
        dto.setSurname(personEntity.getSurname());

        System.out.println(dto);
    }
}

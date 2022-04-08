package az.iktlab.groupj4web.util.builder;

public class Main {

    public static void main(String[] args) {
        Person person = Person.builder()
                .id(1L)
                .name("Khayal")
                .age(23)
                .surname("Farziyev")
                .build();

        System.out.println(person);
    }
}

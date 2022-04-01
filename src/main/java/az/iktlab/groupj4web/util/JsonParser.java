package az.iktlab.groupj4web.util;

import az.iktlab.groupj4web.model.Hello;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class JsonParser {

    @PostConstruct
    public void test() throws JsonProcessingException {
        System.out.println();
        System.out.println();
        System.out.println();
        ObjectMapper mapper = new ObjectMapper();

        Hello hello = new Hello(2L, "Khayal");
        System.out.printf("Object: %s\n", hello);

        String json = mapper.writeValueAsString(hello);

        System.out.printf("Json data : %s\n", json);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

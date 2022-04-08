package az.iktlab.groupj4web.util.facade;

public class Main {

    public static void main(String[] args) {

        HumanService service = new HumanServiceImpl();
        service.read("Hello Design Patterns");

    }
}
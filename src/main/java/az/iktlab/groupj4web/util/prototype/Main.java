package az.iktlab.groupj4web.util.prototype;

public class Main {
    public static void main(String[] args) {

        Connector connectorOne = new Connector();
        connectorOne.setId(1);
        connectorOne.setPort(5432);
        connectorOne.setUrl("jdbc:postgresql://localhost:5432/postgres");
        connectorOne.setPassword("123456");
        connectorOne.setUsername("root");

        System.out.println(connectorOne);

        Connector connectorTwo = connectorOne.clone();
        connectorTwo.setId(2);
        connectorTwo.setPort(3306);
        connectorTwo.setUrl("jdbc:mysql://localhost:3306/mysql");
        System.out.println(connectorTwo);

        System.out.println(connectorOne);
    }
}

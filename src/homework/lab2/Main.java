package homework.lab2;

public class Main {
    public static void main(String[] args) {
        Client first_client = new Client.ClientBuild()
                .debt(5)
                .bonus(200)
                .name("James")
                .salary(500)
                .build();
        System.out.println(first_client);
    }
}

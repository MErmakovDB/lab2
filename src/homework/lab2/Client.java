package homework.lab2;

import lombok.ToString;

@ToString
public class Client {
    private final int debt; //todo you can't remove final
    private final int bonus;
    private final String name;
    private final int salary;

    private Client(ClientBuild build) {
        debt = build.debt;
        bonus = build.bonus;
        name = build.name;
        salary = build.salary;
    }

    public static class ClientBuild {
        private int debt;
        private int bonus;
        private String name;
        private int salary;

        public ClientBuild debt(int debt) {
            this.debt = debt;
            return this;
        }

        public ClientBuild bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public ClientBuild name(String name) {
            this.name = name;
            return this;
        }

        public ClientBuild salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
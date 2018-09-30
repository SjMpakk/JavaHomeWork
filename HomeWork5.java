/**
 * Java homework 5
 *
 * @author Alexey Denisov
 * @version dated Sep 30, 2018
 */



public class HomeWork5 {
    public static void main(String[] args) {
        Specialist[] specialists = new Specialist[5];
        specialists[0] = new Specialist("Vlfsov", "Alexander", "Vladimirovich",
                "bookkeeper", "Vlasovav@mail.ru", 25000, 31);
        specialists[1] = new Specialist("Fomin", "Andrey", "Ivanovich", "jurist",
                "Fominai@mail.ru", 31000, 42);
        specialists[2] = new Specialist("Ivanov", "Ivan", "Ivanovich",
                "junior substitute", "ivanovii@mail.ru", 10000, 45);
        specialists[3] = new Specialist("Petrov", "Petr", "Petrovich", "senior substitute",
                "petrovpp@mail.ru", 7700, 22);
        specialists[4] = new Specialist("Sidorov", "Sidor", "Sidorovich",
                "controller", "sidorovss@mail.ru", 35000, 58);

        for (Specialist x : specialists)
            if (x.findAge() > 40)
                x.showFullInformation();
    }
}

class Specialist {
    private String firstname, name, middlename, position, email;
    private int salary, age;

    Specialist(String firstname, String name, String middlename, String position, String email, int salary, int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void showFullInformation() {
        System.out.println("firstname: " + firstname + " | name: " + name
                + " | middlename: " + middlename + " | position: " + position
                + " | email: " + email + " | salary: " + salary + " | age: "
                + age);
    }

    int findAge() {
        return age;
    }
}

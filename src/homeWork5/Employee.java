package homeWork5;

public class Employee {
    private String fio;
    private String post;
    private String mail;
    private int number;
    private int salary;
    private int age;

    public Employee(String fio, String post, String mail, int number, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("Сотрудник: ФИО %s, Должность %s, Почта %s, Номер %d, Заработная плата %d, Возраст %d %n", fio, post, mail, number, salary, age);
    }

     void printInfo() {
         System.out.println(this);
    }

    public int getAge() {
        return age;
    }
}

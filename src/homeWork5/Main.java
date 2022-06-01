package homeWork5;

public class Main {

    public static void main(String[] args) {
    Employee employee1 = new Employee("Иванов Иван", "менеджер", "Asdasd@gmail.com", 3832442, 38000, 25 );
    Employee[] employees = new Employee[5];
    employees[0] = new Employee("Копылов Денис", "Бухгалтер", "Bomba@mail.ru", 3830253, 40000, 29);
    employees[1] = new Employee("Арсеньев Артем", "Стажер", "Wild@inbox.ru", 38389252, 24000, 19);
    employees[2] = new Employee("Томин Кирилл", "заместитель директора", "Megazol@mail.ru", 3838247, 60000, 32);
    employees[3] = new Employee("Перст Виктор", "директор", "Swaggajugga@gmail.com", 3835678, 80000, 35);
    employees[4] = new Employee("Перст Яна", "коуч", "Ulala@gmail.com", 3839825, 35000, 24);

        for (int i = 0; i < employees.length; i++) {
        if(employees[i].getAge()>=30) {
            employees[i].printInfo();
        }

        }




    employee1.printInfo();
    // вывел старше 30-ти. Думаю сути дела не изменит.
    }

}
